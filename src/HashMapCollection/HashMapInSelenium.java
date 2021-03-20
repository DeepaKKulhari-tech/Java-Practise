package HashMapCollection;

import java.util.HashMap;

public class HashMapInSelenium {

	public static void main(String args[]) {
		System.out.print(getUserName("GuestUser_01"));
		System.out.println(getUserPassword("GuestUser_01"));
		System.out.print(getUserName("Admin"));
		System.out.println(getUserPassword("Admin"));
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

}
