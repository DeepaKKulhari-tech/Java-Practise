package com.coder.Byte;

public class MaxlengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(LongestWord("fun&!! time"));
		
		
	}
	

	  public static String LongestWord(String sen) {
	    // code goes here  
	    
		String str = sen.replaceAll("\\p{Punct}","");
	    String[] sen1=str.split(" ");
	    int max=sen1[0].length();
	    String sen2="";
	    for(int i=0;i<sen1.length;i++)
	    {
	       if(sen1[i].length()>max)
	       {
	         max=sen1[i].length();
	         sen2=sen1[i];
	       }

	    }
	    
	    return sen2;
	  }

}
