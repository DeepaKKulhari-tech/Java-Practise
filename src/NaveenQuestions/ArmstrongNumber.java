package NaveenQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 15300;
		//System.out.println(isArmsStrong(num));
		findArmStrong(num);
	}

	public static boolean isArmsStrong(int num)
	{
		int t=num;
		int r;
		int cube=0;
		while(num!=0)
		{
		r=num%10;
		cube =cube + (r*r*r);
		num=num/10;
		}
		if(cube==t)
		return true;
		else
		return false;
		
		
	
		
	}

	public static void findArmStrong(int num)
	{
		for(int i=0;i<=num;i++)
		{
			if(isArmsStrong(i))
			{
				System.out.println(i);
			}
		}
			
	}

}
