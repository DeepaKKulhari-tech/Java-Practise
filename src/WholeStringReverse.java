
public class WholeStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "my current company is Magic";
		String s1="";
		
		char ch[]=s.toCharArray();
		for(int x=s.length()-1;x>=0;x--)
		{
			
			
			s1=s1+String.valueOf(ch[x]);
			
		}
		System.out.println("=================");
		System.out.println(s1);
		
		
		
		

	} 

}
