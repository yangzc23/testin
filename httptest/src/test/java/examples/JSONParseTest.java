package examples;

import java.util.List;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import model.Employee;

public class JSONParseTest {
	@Test
	public void f(){
		String str = "{\"id\":9000,\"age\":27,\"dept\":{\"city\":\"�Ϻ�\",\"dName\":\"���۲�\",\"id\":10},\"name\":\"����\",\"salary\":10000.0}";
		
		Employee emp = JSON.parseObject(str, Employee.class);
		
		System.out.println(emp);
		
		String str2 = "[{\"id\":9001,\"age\":27,\"dept\":{\"city\":\"�Ϻ�\",\"dName\":\"���۲�\",\"id\":10},\"name\":\"����\",\"salary\":10000.0},{\"id\":9002,\"age\":30,\"dept\":{\"city\":\"�Ϻ�\",\"dName\":\"���۲�\",\"id\":10},\"name\":\"����\",\"salary\":12000.0}]";
		
		List<Employee> emps = JSON.parseArray(str2, Employee.class);

		//JSONArray arr = JSON.parseArray(str2);
		
		
		for(Employee e:emps){
			System.out.println(e);
		}
	
	}
}
