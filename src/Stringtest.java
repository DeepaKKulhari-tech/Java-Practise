import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is Rajat";
		String str = new String(s);

		int i = 0;
		ArrayList<String> arr = new ArrayList<String>();

		System.out.println(s.length());

		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {

			arr.add(st.nextToken());

		}

		System.out.println(arr.size());
		for (i = 0; i < arr.size(); i++) {
			for (int j = arr.get(i).length() - 1; j >= 0; j--) {
				System.out.print(arr.get(i).charAt(j));

			}
			System.out.print(" ");
		}

		// System.out.print(" "+arr.get(i).length());

		// System.out.println(arr.get(1).charAt(2));
		/*
		 * Collections.reverse(arr); Iterator itr=arr.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		//This is to reverse each word keeping sentence same.

	}

}
