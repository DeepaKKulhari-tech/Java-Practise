package NaveenQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My home is in green plaza My";
		
		System.out.println(str);
		
		String[]arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
		
System.out.println("\n====================================================");

		
		char [] ch=str.toCharArray();
		
		for(int k=ch.length-1;k>=0;k--)
		{
			System.out.print(ch[k]);
		}
		
		System.out.println("\n================string count====================================");
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		
		for(int p=0;p<arr.length;p++)
		{
			if(hm.containsKey(arr[p]))
			{
				hm.put(arr[p],hm.get(arr[p])+1);
				
			}
			else
				hm.put(arr[p], 1);
		}
		
		
		Iterator<Entry<String,Integer>> entry=hm.entrySet().iterator();
		
		while(entry.hasNext())
		{
			Entry<String, Integer> set=entry.next();
			
			
			System.out.println(set.getKey()+":"+set.getValue());
		}
		
		
		System.out.println("\n================character count====to be continued================================");
		
		
HashMap<Character, Integer> hm1=new HashMap<Character, Integer>();
		
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				//hm.put(c,hm.get(c)+1);
			}
			else
				hm.put(c+"", 1);
		}
		
		System.out.println(hm1);
		
		Iterator<Entry<String,Integer>> entry1=hm.entrySet().iterator();
		
		while(entry.hasNext())
		{
			Entry<String, Integer> set=entry.next();
			
			
			System.out.println(set.getKey()+":"+set.getValue());
		}
		
	}

}
