package cn.test.model;


/**
 * �Զ���ĳ���Ա��
 * @author yangzc
 *
 */
public class Programmer extends Employee {

	private int hot;
	
	public Programmer() {
		super();//���ø���Object�Ĺ��췽��
		// TODO Auto-generated constructor stub
	}

	public Programmer(String id, String name, boolean gender, double salary, int hot) {
		//���ø���Ĺ��췽����ʼ�����ŵ�����
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
