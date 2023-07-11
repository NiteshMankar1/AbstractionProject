package com.interfaceexample;

public interface Service {

	/*Interface
	 * --> This is same as abstract class but methods difference is we can only provide abstract method here
	 * --> We do not need to give abstract here
	 * --> Implements keyword in the place of extends
	 * --> we can not create object, constructor of interface
	 * --> We cannot update the value of variable of interface class because they are always final internally
	 * --> after 1.8 version we can implement static method in interface
 	 * */
	
//	int a; //In interface we cannot only declare global variable we have to initialze it
	int a = 12; //This act as final variable// Internaly its like (public static final int a = 12;)
	void display(); //public abstract void display
//	void show(); //public abstract void show
	void test(); //public abstract void test
	
	
	int add(int a,int b);
	
	static void show()
	{
		System.out.println("this is Service- show");
	}
}
