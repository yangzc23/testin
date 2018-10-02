package cn.test.model;


/**
 * 项目经理类
 * @author yangzc
 *
 */
public class PM extends Employee {
	private int sid ;
	private String sname;
	private boolean sgender;
	private int ssalary;
	private int sexp;
	private int sbonus;
	public  PM(int id,String name,boolean gender,int salary,int exp,int bonus) {
		this.sid = id ;
		this.setSname(name);
		this.sgender = gender;
		this.ssalary = salary;
		this.sexp = exp;
		this.sbonus = bonus;
	}
	
	
	
	
	 public PM() {
		sid = 102 ;
		setSname("李四");
		sgender = false;
		ssalary = 1423;
		sexp = 2000;
		sbonus = 1200;
		// TODO 自动生成的构造函数存根
	}

	 


	public void show() {
		System.out.println("员工编号："+sid);
		System.out.println("姓名："+getSname());
		System.out.println("工资："+ssalary);
		System.out.println("项目经验:"+sexp);
		System.out.println("项目分红："+ sbonus);
	}




	public String getSname() {
		return sname;
	}
	public int getsid() {
		return sid;
	}
	public int getsbonus() {
		return sbonus;
	}
	public int getssalary() {
		return ssalary;
	}
	public boolean getsgender() {
		return sgender;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void getsid(int sid) {
		this.sid = sid;
	}
	public void setsbonus(int sbonus) {
		this.sbonus = sbonus;
	}
	public void setsexp(int sexp) {
		this.sexp = sexp;
	}
	}

