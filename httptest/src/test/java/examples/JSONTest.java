package examples;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import model.Dept;
import model.Employee;

public class JSONTest {
  @Test
  public void f() {
		//����һ������ʵ��
		Dept dept = new Dept(10,"���۲�","�Ϻ�");
		//����һ��Ա��ʵ��
		Employee emp = new Employee();
		//����Ա�������������䣬���ŵ�����
		emp.setName("��ޱ");
		emp.setDept(dept);
		emp.setId(1001);
		emp.setSalary(12000.0);
		//ʹ��JSON��Ա���ַ���ת��JSON�ַ���
		String str = JSON.toJSONString(emp);
		System.out.println(str);
  }
}
