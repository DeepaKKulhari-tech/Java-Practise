package com.coder.Byte;
import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) {
		// code goes here
		Set<Integer> list1 = new TreeSet<Integer>();
		Set<Integer> list2 = new TreeSet<Integer>();

		String strArrNew[] = strArr;
		String[] strArr1 = strArrNew[0].split(",");
		String[] strArr2 = strArrNew[1].split(",");

		for (int i = 0; i < strArr1.length; i++) {
			list1.add(Integer.parseInt(strArr1[i].replace(" ", "")));
		}
		for (int i = 0; i < strArr2.length; i++) {
			list2.add(Integer.parseInt(strArr2[i].replace(" ", "")));
		}

		
		list1.retainAll(list2);
		

		Object[] strAr = list1.toArray();
		
		String s = Arrays.toString(strAr);
		String s1 = s.replace("[", "");
		String s2 = s1.replace("]", "");
	
		return s2.replace(" ","");
	}

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"})); 
  }

}