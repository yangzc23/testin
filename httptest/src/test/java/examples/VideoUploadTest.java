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
		//�õ�һ���ͻ��ˣ�������������ģ�
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //����һ��Post����
        HttpPost httpPost = new HttpPost("http://v.polyv.net/uc/services/rest?method=uploadfile");
        //entity��ʾ����(body)
        //StringEntity entity = null;
        HttpEntity entity = null;      
        //httpResponse��ʾ��Ӧ
        HttpResponse httpResponse = null;
        //headers��ʾ��Ϣͷ(response headers)
        Header[] headers = null;
        try {
        	//�������������
        	entity = MultipartEntityBuilder.create().
        			addTextBody("writetoken", "f56c086c-a208-4a21-badf-bf06d70fe356").
        			addTextBody("JSONRPC", "{\"title\": \"yzc\", \"tag\":\"yzc\",\"desc\":\"yzc\"}").
        			addBinaryBody("Filedata", new File("C:\\Users\\yangzc\\Desktop\\FlickAnimation.avi")).build();

            //��entity����Ϊpost���������
            httpPost.setEntity(entity);
            //���͸�post����
            httpResponse = httpClient.execute(httpPost);
            //
            headers = httpResponse.getAllHeaders();
            for(Header h:headers){
            	System.out.println(h.toString());
            }
            String responseBody = EntityUtils.toString(httpResponse.getEntity());
            System.out.println(responseBody);
            //��responseBody���json�ַ���ת��json����
            JSONObject obj = JSON.parseObject(responseBody);
            //��ȡjson����data���Ե����ݣ�json���飩
            JSONArray data = (JSONArray)obj.get("data");
            //��ȡdata��������ĵ�һ��json����
            JSONObject video = data.getJSONObject(0);
            //��ȡjson�����mp4���Ե�����
            System.out.println("================="+video.get("mp4"));            
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();
    }
}
