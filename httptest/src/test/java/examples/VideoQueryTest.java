package examples;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;



public class VideoQueryTest {
    public static void main(String[] args)throws Exception
    {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String userId = "705e4a6271";
        String tag = "demo";
        String secretkey = "g6UuoJKst3";
        StringBuilder url = new StringBuilder();
        url.append("http://api.polyv.net/v2/video/");
        url.append(userId);
        url.append("/search?");
        long time = System.currentTimeMillis();
        url.append("format=xml");        
        url.append("&ptime="+time);
        url.append("&tag="+tag);
        String str = "format=xml"+"&ptime="+time+"&tag="+tag+secretkey;
        String sign = DigestUtils.sha1Hex(str).toUpperCase();
        //System.out.println(sign);
        url.append("&sign="+sign);
        HttpGet httpGet = new HttpGet(url.toString());
        HttpResponse httpResponse = null;
        try {
            //∑¢ÀÕ∏√«Î«Û
            httpResponse = httpClient.execute(httpGet);
            SAXReader reader = new SAXReader();
            Document doc = reader.read(httpResponse.getEntity().getContent());
            Element root = doc.getRootElement();
            System.out.println(root.element("status").getText());
            System.out.println(root.element("total").getText());            
            //System.out.println(EntityUtils.toString(httpResponse.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpClient.close();
    }
}
