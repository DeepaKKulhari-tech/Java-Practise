package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("ddepak---01");
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		ArrayList<Object> alll = new ArrayList<Object>();
		alll.add(1);
		alll.add("deepak");

		// Virtual capacity and Physical capcity concept.

		// combine one arrayList into another
		// alll.addAll(al);
		alll.addAll(0, al); // from which index to add other arrayList
		System.out.println(alll);

		System.out.println(al1);
		al1.clear(); // remove elements
		System.out.println(al1);

		ArrayList newal = (ArrayList) al.clone();// created a copy of new arrayList
		System.out.println(newal);

		System.out.println(alll.contains(2)); // //contains any element

		System.out.println(alll.indexOf("deepak"));// index of elements
		// gives the last index if duplicate elements are present
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Deepak", "Naveen", "paytm", "Bijak", "Naveen"));

		System.out.println(list1.lastIndexOf("Naveen"));
		// remove on the basis of index
		list1.remove(2);
		System.out.println(list1);
		// remove elements by condition
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		list2.removeIf(num -> num % 2 != 0);
		System.out.println(list2);

		// retain the elements on condition
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("Abc", "bcd", "def", "Abc"));
		list3.retainAll(Collections.singleton("Abc"));
		System.out.println(list3);

		// fetching the sublist
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		ArrayList<Integer> sublist = new ArrayList<Integer>(list4.subList(2, 4));
		System.out.println(sublist);

		// convet arrayList to array

		ArrayList list5 = new ArrayList<String>(Arrays.asList("Deepak", "tom", "dick", "Harry"));
		Object[] arr = list5.toArray();
		System.out.println(Arrays.toString(arr));//returns single dimensions array

		for (Object p : arr) {
			System.out.println(p);
		}

	}
 
}
