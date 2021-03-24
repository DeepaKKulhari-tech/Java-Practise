
public class WholeStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "my current company is Magic";
		
		char ch[]=s.toCharArray();
		for(int x=s.length()-1;x>=0;x--)
		{
			
			System.out.print(ch[x]);
			
		}

	} 

}
