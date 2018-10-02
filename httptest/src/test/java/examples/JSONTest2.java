package examples;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import model.Dept;
import model.Employee;

public class JSONTest2 {
  @Test
  public void f() {
	  	List<Employee> emps = new ArrayList<Employee>();
		Dept dept = new Dept(10,"���۲�","�Ϻ�");		//����һ������ʵ��
		Dept dept2 = new Dept(20,"�з���","����");		//����һ������ʵ��
		Employee emp = new Employee();		//����һ��Ա��ʵ��
		Employee emp2 = new Employee();		//����һ��Ա��ʵ��
		emp.setName("��ޱ");		//����Ա�������������䣬���ŵ�����
		emp.setDept(dept);
		emp.setId(1001);
		emp.setSalary(12000.0);
		emp2.setName("����");
		emp2.setDept(dept2);
		emp2.setId(2003);
		emp2.setSalary(8000.0);		
		emps.add(emp);
		emps.add(emp2);
		String str = JSON.toJSONString(emps);	//ʹ��JSON��Ա������ת��JSON�ַ���
		System.out.println(str);
  }
}
