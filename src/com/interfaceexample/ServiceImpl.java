package com.interfaceexample;

public class ServiceImpl implements Service {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Implemented method");
	}

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		ServiceImpl s = new ServiceImpl();
		s.display();
		System.out.println("s.a>>"+s.a);
		
		Service.show();
		System.out.println("Service.a>>"+Service.a);
		
		s.add(10, 20);
		System.out.println("Addition>>"+a);
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	
}

/*Diff between Abstract class and interface
 * 									Abstract cls					Interface			
 * 1)Constructor					allowed							Na
 * 2)Variable						normal							public static
 * 3)methods(non static)			combination					
 * 4)multiple inheritance			Not supported					supported
 * 5)								
 * 6)access specifier				any								public
 * 
 */
 
 
 /*This & Super keyword
  * Object related only(no static needed)
  * 
  * 1)this keyword:
  * this means current
  * if we have to use variable, method and constructor in same class
  * then we have to use (this) keyword// and it is use for global variable
  */