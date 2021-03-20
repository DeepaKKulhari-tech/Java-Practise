package ArrayListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=============Iterator====================");
		ArrayList<String> subjects=new ArrayList<String>();
		subjects.add("Hindi");
		subjects.add("English");
		subjects.add("maths");
		subjects.add("sanskrit");
		
		Iterator<String> itr=subjects.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		System.out.println("=============for each loop====================");
		
		for(String s:subjects)
		{
			System.out.println(s);
		}
		
		System.out.println("=============for loop and size method====================");
		
	for(int i=0;i<subjects.size();i++)
		System.out.println(subjects.get(i));
	
	System.out.println("=============List Iterator====================");
	
	 ListIterator<String> list=subjects.listIterator(subjects.size());
	 while(list.hasPrevious())
	 {
		 System.out.println(list.previous());
	 }
	
	}
	
	
	
	

}
