package com.strings;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Deepak";
		String s1=s.replace(s,"kumar");
		System.out.println(s1);
		
		String temp;
		
		temp=s;
		s=s1;
		s1=temp;
		
		System.out.println("swap string: "+s1);
		System.out.println("swap string: "+s);
		
	}

}
