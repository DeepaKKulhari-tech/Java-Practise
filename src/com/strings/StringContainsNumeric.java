package com.strings;

public class StringContainsNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="DeepKumar";
		char[] ch1=s.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			boolean b=Character.isDigit(ch1[i]);
			System.out.println(b);
			
		if(Character.isDigit(ch1[i]))
		{
			System.out.println(ch1[i]);
		System.out.println("contains digit");
		break;
		}
		
		}
	}

}
