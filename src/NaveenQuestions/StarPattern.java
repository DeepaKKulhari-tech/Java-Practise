package NaveenQuestions;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for(int i=5;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}