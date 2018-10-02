package cn.test.model;
/**
 * Employee是父类
 * @author yangzc
 *
 */
public class Employee implements Comparable<Employee>{
	private String id;
	private String name;
	private boolean gender;
	private double salary;
	
	public Employee() {
		super();//调用父类的构造方法，Employee员工类的父类是Object
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, boolean gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	public void show(){
		System.out.println("[id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]");
	}

	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int)(this.salary-o.salary);
	}
	
	
	
}
