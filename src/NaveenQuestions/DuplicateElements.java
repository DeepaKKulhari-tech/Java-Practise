package NaveenQuestions;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = { "deepak", "sweta", "mithun", "piyush", "sweta", "mithun" };

		int len = name.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (name[i].equals(name[j])) {
					System.out.println("duplicate element :" + name[i]);
				}
			}
		}

		System.out.println("============================================");

		Set s = new HashSet();
		for (String names : name) {
			if (s.add(names) == false) {
				System.out.println("duplicate element: " + names);
			}
			;
		}

		System.out.println("=================*******===========================");

		Map<String,Integer> m = new HashMap<String,Integer>();
		for (String nam : name) {
			Integer count = m.get(nam);
			if (count == null) {
				m.put(nam, 1);
			} else
				m.put(nam, ++count);

		}
		
	Set<java.util.Map.Entry<String, Integer>> store=m.entrySet();
	for(java.util.Map.Entry<String, Integer> s1:store)
	{
		if(s1.getValue()>1)
		{
			System.out.println("Duplicate :"+s1.getKey());
		}
	}
	
	System.out.println(m);
	}

} 
