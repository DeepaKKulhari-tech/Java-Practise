package com.practise.java;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		uniqueString("I love maggie");
	}

	static void uniqueString(String str) {
        // initialize an empty string
        String temp = "";
        // iterate over test string
        for(int i=0;i<str.length();i++) {
            // store the into char
            char current = str.charAt(i);
            //System.out.println(temp.indexOf(current));
            // check if it present in the temp string
            // if not then add char into the string
            if(temp.indexOf(current) < 0) {
                temp=temp+current;
            }
        }
        // print the final string
        System.out.println(temp);
    }

	
}
