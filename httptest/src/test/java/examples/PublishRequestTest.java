package examples;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class PublishRequestTest {
	@Test
	public void f() throws Exception{
		//得到一个客户端（用来发送请求的）
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个Post请求
        HttpPost httpPost = new HttpPost("http://192.168.0.153:8090/phpwind/index.php?c=post&a=doadd&_json=1&fid=2");
        //entity表示主体(body)
        //StringEntity entity = null;
        HttpEntity entity = null;      
        //httpResponse表示响应
        HttpResponse httpResponse = null;
        //headers表示消息头(response headers)
        Header[] headers = null;
        try {
        	//设置请求消息主体的内容
        	entity = MultipartEntityBuilder.create().
        			addTextBody("atc_title", "httpclient test sfsagadgadfg").
        			addTextBody("atc_content", "[s:弹][s:弹][s:弹][s:弹][s:弹][s:弹][s:抱抱][s:抱抱]").
        			addTextBody("tid","").
        			addTextBody("special","default").
        			addTextBody("reply_notice","1").
        			addTextBody("csrf_token","103d2fbdb1afce72").build();

            httpPost.setHeader("Cookie","csrf_token=103d2fbdb1afce72; Bzi_winduser=Cs2yZ1JNB4SAKngk6S9ao8wuapYwiaqjnwsYCRamtErCiMRsApOE%2FA%3D%3D; Bzi_visitor=APnHp3aSD9Kj8VNZ8hxDhN85nDCeNfidgviWAGfo58s%3D; Bzi_lastvisit=1395%091533007404%09%2Fphpwind%2Findex.php%3Fm%3Demotion%26type%3Dbbs%26csrf_token%3D103d2fbdb1afce72");
            //将entity设置为post请求的主体
            httpPost.setEntity(entity);
            //发送该post请求
            httpResponse = httpClient.execute(httpPost);
            //
            headers = httpResponse.getAllHeaders();
            //输出响应消息头的内容
            for(Header h:headers){
                System.out.println(h.toString());
            }
            //输出响应消息主体的内容
            System.out.println(EntityUtils.toString(httpResponse.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();
    }
}
