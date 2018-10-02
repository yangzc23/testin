package cn.test.model;


/**
 * 自定义的程序员类
 * @author yangzc
 *
 */
public class Programmer extends Employee {

	private int hot;
	
	public Programmer() {
		super();//调用父类Object的构造方法
		// TODO Auto-generated constructor stub
	}

	public Programmer(String id, String name, boolean gender, double salary, int hot) {
		//调用父类的构造方法初始化工号等属性
		super(id, name, gender, salary);
		this.hot = hot;
	}

	public int getHot() {
		return hot;
	}

	public void setHot(int hot) {
		this.hot = hot;
	}

	@Override
	public void show(){
		System.out.println(super.getId()+","+super.getName()+","+super.getSalary()+","+hot);
	}
	
	
}
