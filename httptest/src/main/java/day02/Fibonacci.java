package day02;

public class Fibonacci {
    /**
     * 返回斐波那契数第n个值,n从0开始
     * 实现方式，基于递归实现
     * @param n
     * @return
     * @author yangzc@163.com
     * @throws MyException 
     * @since 1.8
     */
    public static int getFib(int n) throws MyException{
    	if(n > 46){
    		throw new MyException("索引值超出限制");
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

