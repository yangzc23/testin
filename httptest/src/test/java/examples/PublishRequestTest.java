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
		//�õ�һ���ͻ��ˣ�������������ģ�
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //����һ��Post����
        HttpPost httpPost = new HttpPost("http://192.168.0.153:8090/phpwind/index.php?c=post&a=doadd&_json=1&fid=2");
        //entity��ʾ����(body)
        //StringEntity entity = null;
        HttpEntity entity = null;      
        //httpResponse��ʾ��Ӧ
        HttpResponse httpResponse = null;
        //headers��ʾ��Ϣͷ(response headers)
        Header[] headers = null;
        try {
        	//����������Ϣ���������
        	entity = MultipartEntityBuilder.create().
        			addTextBody("atc_title", "httpclient test sfsagadgadfg").
        			addTextBody("atc_content", "[s:��][s:��][s:��][s:��][s:��][s:��][s:����][s:����]").
        			addTextBody("tid","").
        			addTextBody("special","default").
        			addTextBody("reply_notice","1").
        			addTextBody("csrf_token","103d2fbdb1afce72").build();

            httpPost.setHeader("Cookie","csrf_token=103d2fbdb1afce72; Bzi_winduser=Cs2yZ1JNB4SAKngk6S9ao8wuapYwiaqjnwsYCRamtErCiMRsApOE%2FA%3D%3D; Bzi_visitor=APnHp3aSD9Kj8VNZ8hxDhN85nDCeNfidgviWAGfo58s%3D; Bzi_lastvisit=1395%091533007404%09%2Fphpwind%2Findex.php%3Fm%3Demotion%26type%3Dbbs%26csrf_token%3D103d2fbdb1afce72");
            //��entity����Ϊpost���������
            httpPost.setEntity(entity);
            //���͸�post����
            httpResponse = httpClient.execute(httpPost);
            //
            headers = httpResponse.getAllHeaders();
            //�����Ӧ��Ϣͷ������
            for(Header h:headers){
                System.out.println(h.toString());
            }
            //�����Ӧ��Ϣ���������
            System.out.println(EntityUtils.toString(httpResponse.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();
    }
}
