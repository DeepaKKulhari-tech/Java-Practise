package HashMapCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//default capacity is 16 blocks
		//doubly linked List
		
		Map<String,Integer> map1=new LinkedHashMap<String,Integer>();
		map1.put("Tom", 300);
		map1.put("Lisa",200);
		
		System.out.println(map1);
		
		
	}

}
