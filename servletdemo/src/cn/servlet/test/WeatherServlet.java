package cn.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class WeatherServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		//参数url化
		String city = java.net.URLEncoder.encode(request.getParameter("city"), "utf-8");		
		//拼地址
		String url = String.format("https://www.sojson.com/open/api/weather/json.shtml?city=%s",city);        
		System.out.println(url);
		//String url ="http://weather.51wnl.com/weatherinfo/GetMoreWeather?cityCode="+request.getParameter("city")+"&weatherType=1";
        try{
        	CloseableHttpClient  httpClient = HttpClients.createDefault();
            HttpGet httpGet =new HttpGet(url);       
            HttpResponse result =httpClient.execute(httpGet);        
            String resData = EntityUtils.toString(result.getEntity()); 
            response.setHeader("Content-type","application/json;charset=UTF-8");
            response.setCharacterEncoding("utf-8"); 
            response.setHeader("Cache-Control","no-cache"); 
            PrintWriter printWriter =response.getWriter(); 
            printWriter.write(resData);
        }catch(Exception e){
            e.printStackTrace();
        }
	}
}
