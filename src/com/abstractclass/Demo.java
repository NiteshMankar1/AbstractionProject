package com.abstractclass;

public abstract class Demo {


/* Abstraction: --> Hide internal implementation and just highlight the set of services
 * It is the process of hiding the implementation/ certain details and showing imp information which is usefull to end user
 * In java abstraction is followed by two ways
 * In abstract class we can make an abstract method and concrete method also
 * Features of Abstract class
 * 
 * Now the question is we can not create an object of abstract class so how can we call a non-static method in it 
 * for this we need to create an Child class of abstract class
 * -->
 * 
 * 1) Abstract class
 * --> Whenever we create a abstract method we have to make our class abstract compulsory
 * --> abstract class have constructor
 * --> we cannot create object of abstract class
 * --> abstract class is combination of methods, concrete methods or empty class
 */
	
	Demo()
	{
	//This is constructor // means we can create constructor but not an object of it	
	System.out.println("Demo-Constructor");
	}
	
	abstract void display(); 
	//can we use static keyword to abstract method?
	//-->static belongs to class , abstract belongs to class and static is also not overriden
	//can we use private specifier
	//-->No accessible only within the class
	void show() // the method which was provided a body is also called as concrete method and without body is called as abstract method
	{
		System.out.println("Demo-Show()");
	}
	
	public static void main(String[] args) {
//		Demo d = new Demo(); // we cannot create object of this
//		d.display();
	}
}

/*Interface
 * 
 * 
 * */
