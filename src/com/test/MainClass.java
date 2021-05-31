package com.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		Parent p=new Parent();
		Parent pc=new Child();
	    //Child cp=(Child) new Parent();
		
		c.show();
		p.show();
		pc.show();
		//cp.show();
	}

}
