package day02;

public class Fibonacci {
    /**
     * ����쳲���������n��ֵ,n��0��ʼ
     * ʵ�ַ�ʽ�����ڵݹ�ʵ��
     * @param n
     * @return
     * @author yangzc@163.com
     * @throws MyException 
     * @since 1.8
     */
    public static int getFib(int n) throws MyException{
    	if(n > 46){
    		throw new MyException("����ֵ��������");
    	}
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }else if(n == 1 || n ==2){
            return 1;
        }else{
            return getFib(n - 1) + getFib(n - 2);
        }
    }
}

