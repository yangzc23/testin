package cn.test.model;


/**
 * ��Ŀ������
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
		setSname("����");
		sgender = false;
		ssalary = 1423;
		sexp = 2000;
		sbonus = 1200;
		// TODO �Զ����ɵĹ��캯�����
	}

	 


	public void show() {
		System.out.println("Ա����ţ�"+sid);
		System.out.println("������"+getSname());
		System.out.println("���ʣ�"+ssalary);
		System.out.println("��Ŀ����:"+sexp);
		System.out.println("��Ŀ�ֺ죺"+ sbonus);
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

