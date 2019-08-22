package org.cts.test;
import org.cts.test.Singleton;
public class Singleton1 {
	//method
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}

static Singleton1 d= null;
		//CONSTRUCTOR		
		Singleton1() {
			
		}
public static Singleton1 getInstance() {
	if(d==null) {
		d =new Singleton1();
		
	}
	return d;
	
}	
public static void main(String[] args) {
	Singleton1 a =getInstance();
	
	}


}
