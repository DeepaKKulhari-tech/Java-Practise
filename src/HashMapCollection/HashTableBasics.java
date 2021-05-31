package HashMapCollection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Hindi", 95);
		marks.put("Science", 88);
		marks.put("English", 69);
//		marks.put(null, 00);  neither null key nor null values are allowed in HashTable
	//	marks.put("sanskrit",null);
	
		

		System.out.println(marks.get("Science"));


		System.out.println("done");

	}

}
