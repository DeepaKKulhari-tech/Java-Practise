package HashMapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("India", "Delhi");
		hm.put("UK", "Dehradun");
		hm.put("UP", "Luckhnow");
		hm.put("UP", "London"); 
		hm.put(null, "Berlin");// null keys
		hm.put("China", null);// null value

		System.out.println(hm.get("UP"));// override value
		System.out.println(hm.get("USA"));
		System.out.println(hm.get("UK"));
		System.out.println(hm.get(null));// can fetch value on the basis of null value.
		System.out.println(hm.get("China"));
		hm.remove("China"); //remove method to remove entry

		System.out.println("=================Key set========================");

		Iterator<String> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			String keys = itr.next();
			System.out.println(keys + " -> value :" + hm.get(keys));
		}

		System.out.println("==================Entry Set using Iterator=======================");

		Iterator<Entry<String, String>> set = hm.entrySet().iterator();

		while (set.hasNext()) {
			Entry<String, String> entry = set.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
		}
	}

}
