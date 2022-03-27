import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NoOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "I live in Green View";
		
		char ch[]=str.toCharArray();
		
		
		
		char charact='I';
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==charact || ch[i]==Character.toUpperCase(charact) ||ch[i]==Character.toLowerCase(charact ))
			count++;
		}
		System.out.println("count of "+charact+" charater is "+count);
		
		frequencyOfAllChar(str);
		System.out.println("Second method of checking frequency");
		frequencyOfAllCharUsingMap(str);
		
	}
	
	
	public static void frequencyOfAllChar(String str)
	{
		String str1=str.toLowerCase();
		char ch[]=str1.toCharArray();
		int len=ch.length;
		
		ArrayList<Character> list=new ArrayList<Character>();
		
		for(int i=0;i<len;i++)
		{
			if (!(list.contains(ch[i]) || ch[i]==' '))
			{
				int count=1;
			for(int j=i+1;j<len;j++)
			{  
				if(ch[i]==ch[j])
				{
					count++;	
				}
			}
			System.out.println(ch[i]+":"+count);
			list.add(ch[i]);
			}
			
			
		}
		
		
	}
	public static void frequencyOfAllCharUsingMap(String str)
	{
		String str1=str.toLowerCase();
		char ch[]=str1.toCharArray();
		
		
		Map<Character,Integer> mp=new HashMap<>();
		
		for(Character c:ch)
		{
			 if(!mp.containsKey(c))
				mp.put(c,1);
			else
				mp.put(c,mp.get(c)+1);
		}
		
		mp.remove(' ');
		
		
		
		for (Map.Entry<Character, Integer> h :mp.entrySet())
			//if(h.getKey()!=' ')
	     System.out.println(h.getKey()+" : "+ h.getValue());
		
	}
	
	
	
	

}
