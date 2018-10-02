package examples;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class VideoUploadTest {
	@Test
	public void f() throws Exception{
		//得到一个客户端（用来发送请求的）
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个Post请求
        HttpPost httpPost = new HttpPost("http://v.polyv.net/uc/services/rest?method=uploadfile");
        //entity表示主体(body)
        //StringEntity entity = null;
        HttpEntity entity = null;      
        //httpResponse表示响应
        HttpResponse httpResponse = null;
        //headers表示消息头(response headers)
        Header[] headers = null;
        try {
        	//设置主体的内容
        	entity = MultipartEntityBuilder.create().
        			addTextBody("writetoken", "f56c086c-a208-4a21-badf-bf06d70fe356").
        			addTextBody("JSONRPC", "{\"title\": \"yzc\", \"tag\":\"yzc\",\"desc\":\"yzc\"}").
        			addBinaryBody("Filedata", new File("C:\\Users\\yangzc\\Desktop\\FlickAnimation.avi")).build();

            //将entity设置为post请求的主体
            httpPost.setEntity(entity);
            //发送该post请求
            httpResponse = httpClient.execute(httpPost);
            //
            headers = httpResponse.getAllHeaders();
            for(Header h:headers){
            	System.out.println(h.toString());
            }
            String responseBody = EntityUtils.toString(httpResponse.getEntity());
            System.out.println(responseBody);
            //将responseBody这个json字符串转成json对象
            JSONObject obj = JSON.parseObject(responseBody);
            //获取json对象data属性的内容（json数组）
            JSONArray data = (JSONArray)obj.get("data");
            //获取data数组里面的第一个json对象
            JSONObject video = data.getJSONObject(0);
            //获取json对象的mp4属性的内容
            System.out.println("================="+video.get("mp4"));            
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();
    }
}
