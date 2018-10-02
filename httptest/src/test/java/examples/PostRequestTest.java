package examples;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class PostRequestTest {
	@Test
	public void f() throws Exception{
		//得到一个客户端（用来发送请求的）
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个Post请求
        HttpPost httpPost = new HttpPost("http://192.168.1.7:8090/phpwind/index.php?m=u&c=login&a=dorun");
        //entity表示主体(body)
        StringEntity entity = null;
        //httpResponse表示响应
        HttpResponse httpResponse = null;
        //headers表示消息头(response headers)
        Header[] headers = null;
        try {
        	//将注册请求的参数列表保存到entity里面
            entity = new StringEntity("username=jojo&password=123456&backurl=http://192.168.1.7:8090/phpwind/&invite=&csrf_token=0264b985fa4c926e","utf-8");
            //客户端支持的编码格式
            entity.setContentEncoding("UTF-8");
            //客户端支持的数据格式
            entity.setContentType("application/x-www-form-urlencoded");
            //设置请求的消息头
            httpPost.setHeader("Cookie","csrf_token=0264b985fa4c926e; Bzi_visitor=J5xG%2Bo8NDQTc4BkRJzhDicQPXl88%2Fqqx3xa2HS6cyYY%3D; Bzi_lastvisit=1413%091532966203%09%2Fphpwind%2Findex.php%3Fm%3Du%26c%3Dlogin%26a%3Dcheckname");
            //将entity设置为post请求的主体
            httpPost.setEntity(entity);
            //发送该post请求
            httpResponse = httpClient.execute(httpPost);
            //
            headers = httpResponse.getAllHeaders();
            for(Header h:headers){
                System.out.println(h.toString());
            }
            //
            System.out.println(EntityUtils.toString(httpResponse.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();
    }
}
