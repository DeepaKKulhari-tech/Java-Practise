package com.practise.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class StringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.out.println(
		 * WordOccurenceInString("My Name is name and others Name is Deepak and her Name is Deepak also "
		 * ));
		 * 
		 * System.out.println(CharacterCount("DeepakIsMyName kumarToYours"));
		 * System.out.println(
		 * RemoveDuplicates("My Name is name and others Name is Deepak and her Name is Deepak also"
		 * ));
		 * 
		 * 
		 * reverseStringNewMethod("My name is Lakhan");
		 * reverseWordInStringWithoutCollections("My name is Lakhan");
		 */

		// reverseWordUsingCollections("My name is Lakhan");
		// reverseWordInString("My name is Lakhan");
		System.out.println(firstOccurrence("i love maggie and my love"));
		firstOccurrenceUsingHaspMap("i love maggie and my love");
		//compareStrings("Deepat", "Deepal");
		//StringReplace();
		
	}

	public static Map WordOccurenceInString(String str) {
		String str1 = str.toLowerCase();
		String[] strArr = str1.split(" ");

		Map<String, Integer> map = new TreeMap<String, Integer>();

		for (String s : strArr) {
			if (map.get(s) != null)
				map.put(s, map.get(s) + 1);
			else
				map.put(s, 1);
		}
		return map;

	}

	public static Map CharacterCount(String str) {
		String str1 = str.toLowerCase();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		char[] ch = str1.toCharArray();

		for (Character s : ch) {
			if (map.get(s) != null)
				map.put(s, map.get(s) + 1);
			else
				map.put(s, 1);
		}
		map.remove(' ');
		return map;
	}

	public static String RemoveDuplicates(String str) {
		String str1 = str.toLowerCase();
		String[] strArr = str1.split(" ");

		SortedSet<String> set = new TreeSet<String>();

		for (String s : strArr) {
			set.add(s);
		}

		return Arrays.toString(set.toArray()).replace(",", "");

	}

	public static void reverseWordInString(String str) {
		String[] strArr = str.split(" ");

		for (int i = 0; i < strArr.length; i++) {
			//char[] ch = strArr[i].toCharArray();

			for (int j = strArr[i].length() - 1; j >= 0; j--) {
				System.out.print(strArr[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

	public static void reverseWordUsingCollections(String str) {
		String[] str1 = str.split(" ");

		for (String s : str1) {
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			System.out.print(sb + " ");
		}

	}

	public static void reverseWordInStringWithoutCollections(String str) {
		String[] strArr = str.split(" ");

		for (int i = strArr.length - 1; i >= 0; i--) {

			System.out.print(strArr[i] + " ");
		}

	}

	public static void reverseStringNewMethod(String str) {
		String[] strArr = str.split(" ");

		List<String> list = new ArrayList<String>();

		for (String s : strArr) {

			list.add(s);
		}

		Collections.reverse(list);

		System.out.println(list);

	}

	public static char firstOccurrence(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			Boolean duplicate = false;

			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j] && i!=j) {
					duplicate=true;
					break;
				}	
			}
			if(!duplicate) return str.charAt(i);
			
			}
return '-';
		}

	
	public static void firstOccurrenceUsingHaspMap(String str) {
		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (Character c : ch) {
			if (map.get(c) != null)
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}
		//map.remove(' ');

		System.out.println(map);

		for(int u=0;u<str.length();u++)
		{
			char k=str.charAt(u);
			
			if(map.get(k) == 1)
			{
				System.out.println(k);
				break;
			}
		}
		
		
		Iterator<Character> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			char i = itr.next();
			if (map.get(i) == 1) {
				System.out.println(i + ":" + map.get(i));
				break;
			}
		}

	}
	
	
	public static void compareStrings(String str1, String str2)
	{
		System.out.println(str1.compareTo(str2));
		
	}
	
	public static void StringReplace()
	{
		String s="This is my right to learn";
		
		StringBuffer sb=new StringBuffer(s);
		sb.replace(11, 16, "duty and work");
		System.out.println(sb);
		IntStream arr=sb.chars();
		System.out.println(sb.chars());
	}
	
}
