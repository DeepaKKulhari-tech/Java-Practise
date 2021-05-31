package com.practise.java;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

//Java program to find the length of the
//longest substring without repeating
//characters
//abccabuhddy

public class LargestNonRepeatedString {
	
	
	
	
	public static List ListOfSubstring(String str)
	{
		int a_pointer = 0;
		int b_pointer = 0;
		int max = 0;

		Set<Character> set = new LinkedHashSet<Character>();
		//Map<Integer,Integer> indexes= new HashMap<Integer, Integer>();
		List<Set> list=new ArrayList<Set>();
		while (b_pointer < str.length()) {
			if (!set.contains(str.charAt(b_pointer))) {
				set.add(str.charAt(b_pointer));
				b_pointer++;
				max = Math.max(set.size(), max);
				

			} else {	
				System.out.println(set);
                list.add(set);
				set.remove(str.charAt(a_pointer));
				a_pointer++;
			}
			

		}
		return list;
	
	}
	
	
public static void FindCommonSubstrings(String str,String str1)
{
	
List<Set<Character>> list1,list2;


list1=ListOfSubstring(str);
list2=ListOfSubstring(str);


	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static int longestUniqueSubsttr(String str) {
		int a_pointer = 0;
		int b_pointer = 0;
		int max = 0;

		Set<Character> set = new LinkedHashSet<Character>();
		Map<Integer,Integer> indexes= new HashMap<Integer, Integer>();
		while (b_pointer < str.length()) {
			if (!set.contains(str.charAt(b_pointer))) {
				set.add(str.charAt(b_pointer));
				b_pointer++;
				max = Math.max(set.size(), max);
				

			} else {	
				System.out.println(set);
				indexes.put(a_pointer, b_pointer);
				set.remove(str.charAt(a_pointer));
				a_pointer++;
			}
			

		}
		
		Iterator<Entry<Integer, Integer>> itr=indexes.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer, Integer> i=itr.next();
			int diff=i.getValue()-i.getKey();
			if(diff==max)
			{
				System.out.println("length of max length subString");
			   for(int k=i.getKey();k<i.getValue();k++ )
				System.out.print(str.charAt(k));
			}
		}
		
		return max;

	}

	
	public static void FirstdmethodfirstUnique(String str)
	{
	
		int[] alphabets=new int[26];
		for(char s:str.toCharArray())alphabets[s-'a']++;
		
		
		
		for(char s:str.toCharArray())
		{
		if(alphabets[s-'a']==1)	
		{
		System.out.println(s);
		break;
		}
		}
	}
	
	public static void SecondMethodfirstUnique(String str)
	{
		for(char c:str.toCharArray())
		{
		   if(str.indexOf(c)==str.lastIndexOf(c))
		   {
		   System.out.println(c);
		   break;
		   }
		}
	}
	
	public static int longestUniqueSubsttr1(String str)
	{
	    int n = str.length();
	     
	    // Result
	    int res = 0;
	     
	    for(int i = 0; i < n; i++)
	    {
	         
	        // Note : Default values in visited are false
	        boolean[] visited = new boolean[256];
	         
	        for(int j = i; j < n; j++)
	        {
	             
	            // If current character is visited
	            // Break the loop
	            if (visited[str.charAt(j)] == true)
	                break;
	 
	            // Else update the result if
	            // this window is larger, and mark
	            // current character as visited.
	            else
	            {
	                res = Math.max(res, j - i + 1);
	                visited[str.charAt(j)] = true;
	            }
	        }
	 
	        // Remove the first character of previous
	        // window
	        visited[str.charAt(i)] = false;
	    }
	    return res;
	}
	
	
//Driver code
	public static void main(String[] args) {
		String str = "BDCAHDGDJJKLKLLFJDJKLKDNKLYYUHDGABCGK";
		String str1 = "BDCAHDGDJJKLKLJAJSDSLFDFLLDFKDLDLLDL";
		//System.out.println("The input string is " + str);

		//int len = longestUniqueSubsttr(str);
		//System.out.println("The length of the longest " + "non-repeating character " + "substring is " + len);
		//int i=longestUniqueSubsttr1(str);
		//System.out.println(i);
		//Secondmethod("aaafcccdeeeb");
		//thirdMethod("aaafcccdeeeb");
		FindCommonSubstrings(str, str1);
	}
}

