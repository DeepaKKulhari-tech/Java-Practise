package NaveenQuestions;

import java.util.HashMap;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java is Java language that makes other Java and that makes me Java";

		String[] s = str.split(" ");

		// adding keys values to the hashmap

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String words : s) {
			if (hm.containsKey(words)) {
				hm.put(words, hm.get(words) + 1);
			} else
				hm.put(words, 1);
		}

		//extracting and printing the frequency of each word.
		Set<String> set = hm.keySet();

		for (String ss : set) {
               if(hm.get(ss)>1)
               {
            	   System.out.println(ss +" : "+ hm.get(ss));
               }
		}

	}

}
