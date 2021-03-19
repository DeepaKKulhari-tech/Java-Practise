
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
		
	}

}
