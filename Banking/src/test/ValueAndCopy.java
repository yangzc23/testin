package test;

public class ValueAndCopy {
	String str = new String("good");
	char[] ch = {'a','b','c'};
	public static void main(String[] args) {
		ValueAndCopy ex = new ValueAndCopy();
		ex.change(ex.str,ex.ch);
		System.out.print(ex.str+" and ");
		System.out.println(ex.ch);
	}
	public void change(String str,char ch[]){
		str = "test ok";
		ch[0] = 'g';
	}
}
