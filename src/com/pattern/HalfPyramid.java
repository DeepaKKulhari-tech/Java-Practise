package com.pattern;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
