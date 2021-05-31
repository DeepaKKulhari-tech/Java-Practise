package com.practise.java;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isStringRotate("RAJAT","JATRA");

	}
	
	public static void isStringRotate(String str1, String str2)
	{
		String temp;
		temp=str1.concat(str1);
		
		System.out.println(temp.contains(str2));
		 
		
	}
	
	

}
