package examples;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import model.Dept;
import model.Employee;

public class JSONTest {
  @Test
  public void f() {
		//创建一个部门实例
		Dept dept = new Dept(10,"销售部","上海");
		//创建一个员工实例
		Employee emp = new Employee();
		//设置员工的姓名，年龄，部门等属性
		emp.setName("赵薇");
		emp.setDept(dept);
		emp.setId(1001);
		emp.setSalary(12000.0);
		//使用JSON将员工字符串转成JSON字符串
		String str = JSON.toJSONString(emp);
		System.out.println(str);
  }
}
