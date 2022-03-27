import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinValueInHashMap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> m=new HashMap<String, Integer>();
		
		m.put("First", 599);
		m.put("First", 420);
		m.put("First", 610);
		
		System.out.println("min value "+Collections.min(m.values()));
		System.out.println("max value "+Collections.max(m.values()));
		
		System.out.println("When keys are different, it will display the correct value");
		m.put("First", 599);
		m.put("second", 420);
		m.put("Third", 610);
		
		System.out.println("min value "+Collections.min(m.values()));
		System.out.println("max value "+Collections.max(m.values()));
		
		//if the keys are same, it will the last value
		
	}

}
