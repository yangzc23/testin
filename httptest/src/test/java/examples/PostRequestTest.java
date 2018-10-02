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
		//�õ�һ���ͻ��ˣ�������������ģ�
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //����һ��Post����
        HttpPost httpPost = new HttpPost("http://192.168.1.7:8090/phpwind/index.php?m=u&c=login&a=dorun");
        //entity��ʾ����(body)
        StringEntity entity = null;
        //httpResponse��ʾ��Ӧ
        HttpResponse httpResponse = null;
        //headers��ʾ��Ϣͷ(response headers)
        Header[] headers = null;
        try {
        	//��ע������Ĳ����б��浽entity����
            entity = new StringEntity("username=jojo&password=123456&backurl=http://192.168.1.7:8090/phpwind/&invite=&csrf_token=0264b985fa4c926e","utf-8");
            //�ͻ���֧�ֵı����ʽ
            entity.setContentEncoding("UTF-8");
            //�ͻ���֧�ֵ����ݸ�ʽ
            entity.setContentType("application/x-www-form-urlencoded");
            //�����������Ϣͷ
            httpPost.setHeader("Cookie","csrf_token=0264b985fa4c926e; Bzi_visitor=J5xG%2Bo8NDQTc4BkRJzhDicQPXl88%2Fqqx3xa2HS6cyYY%3D; Bzi_lastvisit=1413%091532966203%09%2Fphpwind%2Findex.php%3Fm%3Du%26c%3Dlogin%26a%3Dcheckname");
            //��entity����Ϊpost���������
            httpPost.setEntity(entity);
            //���͸�post����
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
