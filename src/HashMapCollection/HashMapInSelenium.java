package HashMapCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapInSelenium {

	public static void main(String args[]) {
		
		
		
		
		
		for(int i=0;i<3;i++)
		{
			
		System.out.print(getUserName(getRoles(i)));
		System.out.print(" ");
		System.out.println(getUserPassword(getRoles(i)));
		}
	}

	public static HashMap<String, String> getCredentailsList() {

		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Admin", "admin:admin123");
		hm.put("GuestUser_01", "user1:user123");
		hm.put("GuestUser_02", "user2:user234");
		return hm;

	}

	public static String getUserName(String role) {
		try {
			return getCredentailsList().get(role).split(":")[0];
		} catch (Exception e) {
			System.out.println("Incorrect username "+e);
			return null;
		}

	}

	public static String getUserPassword(String role) {
		return getCredentailsList().get(role).split(":")[1];
	}
	
	public static String getRoles(int index)
	{
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Admin","GuestUser_01","GuestUser_02"));
		
		return list.get(index);
		
		
	}

}
