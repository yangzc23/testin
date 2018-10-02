package examples;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

public class XML51JobReadTest {
	/**
	 * ����xml��ʽ���ݵ�˼·��
	 * 	1������һ����������
			SAXReader reader = new SAXReader();
		2����xml��ʽ�����ݽ��ж�ȡ������ȡ�����ݼ��ص��ڴ����棩
			File file = new File("d:\\my.xml");//�����ļ���·��
			//���ļ������ȡ����,��ȡ�������ݱ��浽doc��������
			Document doc = reader.read(file);
		3��ͨ��doc�����ȡ���ڵ�
			���磺Element root = doc.getRootElement();
		4��ͨ���ڵ��element���������ӽڵ㣨��һ����
			���磺Element firstChild = root.element("��ǩ��");
		5��ͨ���ڵ��elements�������ҳ����е��ӽڵ�
			���磺List<Element> list = (List<Element>)root.elements("��ǩ��");
		6��ͨ��get������ȡ��Ӧ�±�Ľڵ�
			���磺Element node = list.get(1);
		7��ͨ���ڵ��getText������ȡ�ڵ�������ı�����
			���磺System.out.println(node.getText());	
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
			System.out.println(e.element("jobname").getText()+"@"+e.element("coname").getText()+","+e.element("jobinfo").getText().replace(",", "��").replace("\n", " "));
		}
	}
}
