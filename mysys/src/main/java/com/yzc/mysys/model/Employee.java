package com.yzc.mysys.model;
/**
 * 实体类：用于描述表t_emp中的数据
 * 属性与表中的列一一对应
 * 表中有几列，类中就有几个属性
 */
public class Employee {
	private int id;
	private String name;
	private double salary;
	private int age;
	private Dept dept;
	
	@Override
	public String toString() {
		return this.id+" "
			  +this.name+" "
			  +this.salary+" "
			  +this.age+" "
			  +this.dept;
	}
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, int age, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}	
	
}
