package examples;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.testng.annotations.Test;

public class XMLTest {
	/**
	 * 读取
	 * @throws Exception
	 */
	@Test
	public void read() throws Exception{
		File file = new File("C:\\Users\\yangzc\\Desktop\\testng.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);
		Element root = doc.getRootElement();
		System.out.println(root.element("test").getText());		
		System.out.println(root.element("test").attributeValue("name"));
	}
	
	/**
	 * 新增节点
	 * @throws Exception
	 */
	@Test
	public void add() throws Exception{
		File file = new File("C:\\Users\\yangzc\\Desktop\\testng.xml");
		Element test = DocumentHelper.createElement("test");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);
		Element root = doc.getRootElement();
		test.setAttributeValue("name","test2");
		test.setText("hellotest");
		root.add(test);
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");	
		XMLWriter writer = new XMLWriter(new FileOutputStream("C:\\Users\\yangzc\\Desktop\\testng.xml"), format);
		writer.write(doc);//document是utf-8编码
		writer.close();	
	}
	
	/**
	 * 修改节点
	 * @throws Exception
	 */
	@Test
	public void modify() throws Exception{
		File file = new File("C:\\Users\\yangzc\\Desktop\\testng.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);
		Element root = doc.getRootElement();
		Element e = (Element)root.elements("test").get(2);
		e.setText("myTest");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");	
		XMLWriter writer = new XMLWriter(new FileOutputStream("C:\\Users\\yangzc\\Desktop\\testng.xml"), format);
		writer.write(doc);//document是utf-8编码
		writer.close();			
	}
	
	/**
	 * 删除节点
	 * @throws Exception
	 */
	@Test
	public void delete() throws Exception{
		File file = new File("C:\\Users\\yangzc\\Desktop\\testng.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);
		Element root = doc.getRootElement();
		Element e = (Element)root.elements("test").get(2);
		e.getParent().remove(e);
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");	
		XMLWriter writer = new XMLWriter(new FileOutputStream("C:\\Users\\yangzc\\Desktop\\testng.xml"), format);
		writer.write(doc);//document是utf-8编码
		writer.close();			
	}	
	
}
