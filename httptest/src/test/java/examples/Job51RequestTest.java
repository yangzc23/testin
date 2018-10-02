package examples;


import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

public class Job51RequestTest {
	@Test
	public void f() throws Exception{
		//拿到一个客户端（用来发送请求）
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//创建一个Get请求
        HttpGet httpGet = new HttpGet("http://192.168.0.153:8090/phpwind/admin.php");
        //httpResponse表示响应结果
        HttpResponse httpResponse = null;
        Header[] headers = null;//headers表示响应消息头
        try {
            httpResponse = httpClient.execute(httpGet);//发送该请求
            //获取响应结果的消息头
            headers = httpResponse.getAllHeaders();
            //讲消息头里面的每个字段及内容打印出来
/*            for(Header h:headers){
                System.out.println(h.toString());
            }*/
            HttpEntity body = httpResponse.getEntity();
            
            SAXReader reader = new SAXReader();
            Document doc = reader.read(body.getContent());
            //List list = doc.selectNodes("title");
            
            
            //将响应的主体转成字符串并输出
            System.out.println(EntityUtils.toString(body));
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();//关闭客户端       
    }
}
