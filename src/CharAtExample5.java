import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class CharAtExample5 {
	public static void main(String[] args) {
		String str = "Deepak";
		String gr[]=str.split("");
		int j=0;
		
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
	 

        for(int i=0;i<str.length();i++)
	  {
        
		  hm.put(gr[i],j);
		  j++;
	  }
	  for(Map.Entry<String,Integer> entry :hm.entrySet())
	  {
		  System.out.println(entry.getKey()+entry.getValue());
	  }
	  
	
	}
}