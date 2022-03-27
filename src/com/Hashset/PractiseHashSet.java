package com.Hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PractiseHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> cities=new HashSet<String>();
		cities.add("meerut");
		cities.add("delhi");
		cities.add("noida");
		cities.add("meerut");// duplicate value will be ignored at run time
	
		System.out.println(cities);
		
		
		System.out.println(cities.contains("delhi"));
		
		System.out.println("=========================================");
		Iterator<String> itr =cities.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("=========================================");
		
		cities.remove("meerut");
		
		for(String s: cities)
		{
			System.out.println(s);
		}
		
		System.out.println("=========================================");
		
		
		Set<Integer> first=new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		//first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		
		
		
		Set<Integer> second=new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,31,40,15}));
		
		Set<Integer> union=new HashSet<Integer>(first);// addAll is to find the total unique elements
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("=========================================");
		
		Set<Integer> intersection=new HashSet<Integer>(first); //  retain method is to find common elements
		intersection.retainAll(second);
		System.out.println(intersection);
		
		System.out.println("=========================================");
		
		Set<Integer> diff=new HashSet<Integer>(first); // A-B
		diff.removeAll(second);
		System.out.println(diff);
		

	}

}
