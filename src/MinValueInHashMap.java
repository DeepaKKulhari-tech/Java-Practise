import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinValueInHashMap {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map m=new HashMap<String, Integer>();
		
		m.put("First", 599);
		m.put("First", 420);
		m.put("First", 410);
		
		System.out.println(Collections.min(m.values()));
		
	}

}
