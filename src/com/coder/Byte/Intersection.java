package com.coder.Byte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "1,3,4,7,13", "1,2,4,13,15" };
		FindIntersection(strArr);
		System.out.println("=======================");
//System.out.println(FindIntersection2(strArr));

	}

	public static String FindIntersection(String[] strArr) {
		// code goes here
		Set<Integer> set1 = new TreeSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		
		
		
		
		
		

		String strArrNew[] = strArr;
		String[] strArr1 = strArrNew[0].split(",");
		String[] strArr2 = strArrNew[1].split(",");

		for (int i = 0; i < strArr1.length; i++) {
			set1.add(Integer.parseInt(strArr1[i]));
		}
		for (int i = 0; i < strArr2.length; i++) {
			set2.add(Integer.parseInt(strArr2[i]));
		}

		System.out.println(set1);
		System.out.println(set2);
		set1.retainAll(set2);
		System.out.println(set1);

		Object[] strAr = set1.toArray();
		System.out.println(Arrays.toString(strAr));
		String s = Arrays.toString(strAr);
		String s1 = s.replace("[", "");
		String s2 = s1.replace("]", "");
		System.out.println(s2);
		return s;
	}

	/*
	 * public static String FindIntersection1(String[] strArr) { TreeSet<Integer>
	 * set1 = Arrays.stream(strArr[0].replace(" ",
	 * "").split(",")).map(Integer::parseInt) .collect(toCollection(TreeSet::new));
	 * TreeSet<Integer> set2 = Arrays.stream(strArr[1].replace(" ",
	 * "").split(",")).map(Integer::parseInt) .collect(toCollection(TreeSet::new));
	 * set1.retainAll(set2);
	 * 
	 * return (set1.isEmpty() ? "false" : Arrays.toString(new
	 * TreeSet<>(set1).toArray()).replace("]", "").replace("[", "").replace(" ",
	 * "")); }
	 */
	

	  public static String FindIntersection2(String[] strArr) {
	    // code goes here
	     
	     String strArrNew[]= strArr;
	     
	     List<Integer> list1=new ArrayList<Integer>();
		 List<Integer> list2=new ArrayList<Integer>();
			 
			  
			  String[] strArr1=strArrNew[0].split(",");
			  String[] strArr2=strArrNew[1].split(",");

			  for(int i=0;i<strArr1.length;i++)
			  {
				 list1.add(Integer.parseInt(strArr1[i]));
			  }
			  for(int i=0;i<strArr2.length;i++)
			  {
				 list2.add(Integer.parseInt(strArr2[i]));
			  }
			  
	  
	           list1.retainAll(list2);
	           
	           Object[] strAr=list1.toArray();
	           String s=Arrays.toString(strAr);
	           String s1=s.replace("[", "");
	           String s2=s1.replace("]", "");
	           return s2;



	  }


}
