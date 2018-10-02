package model;
/**实体�?:与t_user表对�?
 * 每一个列对应�?个属�?*/
public class User {
	private int id;
	private String username;
	private String pwd;
	private String name;
	private String gender;
	
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
	public User(int id, String username, String pwd, String name, String gender) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
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
