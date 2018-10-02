package examples;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class QQTest {
	@Test
	public void f() throws Exception{
		//�õ�һ���ͻ��ˣ�������������ģ�
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //����һ��Post����
        HttpPost httpPost = new HttpPost("http://news.ssp.qq.com/app");
        //entity��ʾ����(body)
        //StringEntity entity = null;
        StringEntity entity = null;      
        //httpResponse��ʾ��Ӧ
        HttpResponse httpResponse = null;
        //headers��ʾ��Ϣͷ(response headers)
        Header[] headers = null;
        try {
        	//�������������
        	entity = new StringEntity("{\"adReqData\":{\"adtype\":4,\"pf\":\"aphone\",\"app_channel\":\"826\",\"ext\":{\"mob\":{\"mobstr\":\"AebK1RRfexSpQ4lU3dtT==\"}},\"ver\":\"5.6.30\",\"appversion\":\"180712\",\"chid\":2,\"slot\":[{\"loid\":\"1\",\"channel\":\"news_news_19\"}],\"launch\":\"0\"}}");

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();
    }
}
