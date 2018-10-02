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
		Dept dept = new Dept(10,"销售部","上海");		//创建一个部门实例
		Dept dept2 = new Dept(20,"研发部","北京");		//创建一个部门实例
		Employee emp = new Employee();		//创建一个员工实例
		Employee emp2 = new Employee();		//创建一个员工实例
		emp.setName("赵薇");		//设置员工的姓名，年龄，部门等属性
		emp.setDept(dept);
		emp.setId(1001);
		emp.setSalary(12000.0);
		emp2.setName("王勇");
		emp2.setDept(dept2);
		emp2.setId(2003);
		emp2.setSalary(8000.0);		
		emps.add(emp);
		emps.add(emp2);
		String str = JSON.toJSONString(emps);	//使用JSON将员工数组转成JSON字符串
		System.out.println(str);
  }
}
