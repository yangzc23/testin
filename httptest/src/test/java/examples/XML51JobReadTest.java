package examples;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

public class XML51JobReadTest {
	/**
	 * 解析xml格式数据的思路：
	 * 	1、创建一个解析工具
			SAXReader reader = new SAXReader();
		2、对xml格式的数据进行读取（将读取的内容加载到内存里面）
			File file = new File("d:\\my.xml");//设置文件的路径
			//从文件里面读取内容,读取到的内容保存到doc对象里面
			Document doc = reader.read(file);
		3、通过doc对象获取根节点
			比如：Element root = doc.getRootElement();
		4、通过节点的element方法查找子节点（第一个）
			比如：Element firstChild = root.element("标签名");
		5、通过节点的elements方法查找出所有的子节点
			比如：List<Element> list = (List<Element>)root.elements("标签名");
		6、通过get方法获取对应下标的节点
			比如：Element node = list.get(1);
		7、通过节点的getText方法获取节点里面的文本内容
			比如：System.out.println(node.getText());	
	 * 
	 * @throws Exception
	 */
	@Test
	public void read() throws Exception{
		File file = new File("C:\\Users\\yangzc\\Desktop\\Fiddler_13-12-48.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);
		Element root = doc.getRootElement();
		Element body = root.element("resultbody");
		List<Element> items = (List) body.elements("item");
		for(Element e:items){
			System.out.println(e.element("jobname").getText()+"@"+e.element("coname").getText()+","+e.element("jobinfo").getText().replace(",", "，").replace("\n", " "));
		}
	}
}
