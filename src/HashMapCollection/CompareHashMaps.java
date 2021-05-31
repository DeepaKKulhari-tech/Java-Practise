package HashMapCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(2, "B");
		map2.put(1, "A");
		
		HashMap<Integer, String> map3=new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//compare on key-value pairs
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//compare on when same keys

		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));//ignore duplicate keys
		
		
		// find extra keys
		
		HashMap<Integer, String> map4=new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		//combine and remove common //A-B
		HashSet<Integer> combineKeys =new HashSet<Integer>(map1.keySet());
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);
		
		//compare hashmap on the basis of values
		
		System.out.println(new ArrayList<String>(map1.values()).equals(new ArrayList<String>(map2.values())));
		
		
		
		
		
		System.out.println(map1.hashCode());

		System.out.println(map2.hashCode());
		System.out.println(map3.hashCode());
		System.out.println(map4.hashCode());
		
		
		

	} 

}
