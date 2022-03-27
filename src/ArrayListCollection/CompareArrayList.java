package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "G", "D","F"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A", "C", "B", "D","E"));

		System.out.println("check if list are equal: "+list1.equals(list2));
//sort the list and compare
		Collections.sort(list1);
		System.out.println("print the list1 after sorting: "+list1);
		Collections.sort(list2);
		System.out.println("print the list2 after sorting: "+list2);

		System.out.println("Again compare list1 and list2 after sorting: "+list1.equals(list2));
		
		//find the additional/missing elements
		
		list2.removeAll(list1); 
		System.out.println("remove all the list1 elements from list2: "+list2);
		
		//common elements
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D","F"));
		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("A", "C", "B", "D","E"));
		
		list3.retainAll(list4);
		System.out.println("common elements between list1 and list2: "+list3);
		
	
		
		
		

	}

}
