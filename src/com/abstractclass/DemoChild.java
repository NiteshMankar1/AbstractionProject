package com.abstractclass;

public class DemoChild extends Demo{

	/* Now here if we write (public class DemoChild extends Demo) like this then it will give error because
	 * it will not allow the abstract method of Parent class here so solve this there are two ways
	 *1) First ways is to make this class also abstract(Then here also we can not make its object again)
	 *2) Second way is to implement that method here also (we are using this way here )
	*/

	@Override
	void display() {  
		// TODO Auto-generated method stub
		System.out.println("Abstract method Implementation");
	}
	
	public static void main(String[] args) {
		DemoChild d = new DemoChild(); // this line will call the constructor of parent class first// There is inbuilt super keyword here
		d.display();
		d.show();
	}
}
