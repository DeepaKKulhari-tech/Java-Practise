package com.practise.java;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Deepak";
		s="kumar";
		
		System.out.println(s);
		
		int[] cchar_cc=new int[128];
		
		for(int i=0;i<s.length();i++)
		{
			cchar_cc[s.charAt(i)]++;
		}
	}

}
