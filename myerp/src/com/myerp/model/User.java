package com.myerp.model;
/**实体类:与t_user表对应
 * 每一个列对应一个属性*/
public class User {
	private int id;
	private String username;
	private String pwd;
	private String name;
	private String gender;
	private String salt;
	
	@Override
	public String toString() {
		return this.id+" "+
			   this.username+" "+
			   this.pwd+" "+
			   this.name+" "+
			   this.gender;
	}
	
	public User() {
		super();
	}
	public User(int id, String username, String pwd, String name, String gender, String salt) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
		this.salt = salt;
	}
	
	
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
