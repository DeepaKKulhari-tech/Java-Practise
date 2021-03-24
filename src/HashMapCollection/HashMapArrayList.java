package HashMapCollection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		ArrayList<Integer> list1=new ArrayList<Integer>(map1.keySet());
		System.out.println(list1);
		ArrayList<String> list2=new ArrayList<String>(map1.values());
		System.out.println(list2);
		
	}

}
