package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D","F"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A", "C", "B", "D","E"));

		System.out.println(list1.equals(list2));
//sort the list and compare
		Collections.sort(list1);
		Collections.sort(list2);

		System.out.println(list1.equals(list2));
		
		//find the additional/missing elements
		
		list2.removeAll(list1);
		System.out.println(list2);
		
		//common elements
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D","F"));
		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("A", "C", "B", "D","E"));
		
		list3.retainAll(list4);
		System.out.println(list3);
		
	
		
		
		

	}

}
