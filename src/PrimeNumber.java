
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		int count = 0;

		if (num == 2 ) {
			System.out.println(num + " is a prime");
		} else if (num > 2) {

			for (int i = num - 1; i > 1; i--) {
				if (num % i == 0) {
					count++;
					break;
				}

			}
			if (count == 0) {
				System.out.println(num + " is a prime");
			} else
				System.out.println(num + " is not a prime");
		} else
			System.out.println(num + " is not a prime");

		System.out.println("+++======================================================++");
		
		int counti=0;
		if (num <1)
		{   counti++;
			System.out.println("Not a prime");
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				counti++;
				System.out.println("Not a Prime");
				break;
			}
		}
		
		if(counti == 0)
		{
			System.out.println("number is prime");
		}
		
		
	}
	
	
	

}
