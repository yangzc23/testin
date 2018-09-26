package com.myerp.model;

/**
 * 实体类：用于描述表t_dept中的数据
 * 属性与表中的列一一对应
 * 表中有几列，类中就有几个属性
 */
public class Dept {
	private int id;
	private String dName;
	private String city;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int id, String dName, String city) {
		super();
		this.id = id;
		this.dName = dName;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", dName=" + dName + ", city=" + city + "]";
	}
	
	
	
}
