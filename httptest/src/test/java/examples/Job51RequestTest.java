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
		//�õ�һ���ͻ��ˣ�������������
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//����һ��Get����
        HttpGet httpGet = new HttpGet("http://192.168.0.153:8090/phpwind/admin.php");
        //httpResponse��ʾ��Ӧ���
        HttpResponse httpResponse = null;
        Header[] headers = null;//headers��ʾ��Ӧ��Ϣͷ
        try {
            httpResponse = httpClient.execute(httpGet);//���͸�����
            //��ȡ��Ӧ�������Ϣͷ
            headers = httpResponse.getAllHeaders();
            //����Ϣͷ�����ÿ���ֶμ����ݴ�ӡ����
/*            for(Header h:headers){
                System.out.println(h.toString());
            }*/
            HttpEntity body = httpResponse.getEntity();
            
            SAXReader reader = new SAXReader();
            Document doc = reader.read(body.getContent());
            //List list = doc.selectNodes("title");
            
            
            //����Ӧ������ת���ַ��������
            System.out.println(EntityUtils.toString(body));
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();//�رտͻ���       
    }
}
