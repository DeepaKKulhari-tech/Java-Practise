package NaveenQuestions;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Boolean b=isPrimeNumber(197);
	System.out.println(b);
	getPrimeNumbers(20);
		
	}
	
	public static boolean isPrimeNumber(int num)
	{
		if (num==2)
			return true;
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
		
	}
	
	public static void getPrimeNumbers(int MaxRange)
	{
		
		for(int j=2;j<MaxRange;j++)
		{
			if(isPrimeNumber(j))
			{
				System.out.println("All primes numbers are:"+j);
			}
		}
	}

}
