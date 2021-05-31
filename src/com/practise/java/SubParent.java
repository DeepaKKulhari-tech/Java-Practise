package com.practise.java;

public class SubParent implements ParentOne {

	@Override
	public void features() {
		// TODO Auto-generated method stub
		
		System.out.println("Same features as parent");
	}

	@Override
	public void surname() {
		// TODO Auto-generated method stub
		System.out.println("Same surname as parent");
	}
	
	public void choices() {
		// TODO Auto-generated method stub
		System.out.println("different choices");
	}

	
	
}
