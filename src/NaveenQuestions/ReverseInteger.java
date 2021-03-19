package NaveenQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345;
		
		String s= num+"";
		char ch[]=s.toCharArray();
		
		int len=ch.length;
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println("=========================*********+++++++++++++++++++++");
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+ num%10;
			num=num/10;
		}
		
		System.out.println("reverse num is "+rev);
	}

}
