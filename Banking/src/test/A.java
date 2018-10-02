package test;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		try{
			methodA();
		}catch(IOException e){
			System.out.println("Caught IOException");
		}catch(Exception e){
			System.out.println("Caught Exception");
		}
	}
	public static void methodA() throws IOException{
		throw new IOException();
	}
}
