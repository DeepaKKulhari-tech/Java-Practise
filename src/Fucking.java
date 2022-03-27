
public class Fucking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Suman";
		System.out.println(s.concat(s));
		//immutable String
		System.out.println(s);
		System.out.println("============Fibonacci series==========");
		int a=0,b=1,c;
		System.out.print(a+",");
		System.out.print(b+",");
		for (int i=0;i<10;i++)
		{
		c=a+b;
		System.out.print(c+",");
		a=b;
		b=c;
		}
		System.out.println();
		
		
		System.out.println("=========Pallindrome====================================");
		int x,q;
		for (int p=1;p<20;p++)
		{
			if(p>9)
			{
				if(p%2==0)
				{
				for(q=0;q<(p/2-1);q++)
					System.out.print(p);
				}
				else 
				{
				for(q=0;q<(p/2-2);q++)
					System.out.print(p);
				}
					
			}
			else {
			for(q=0;q<p;q++)
				System.out.print(p);
			}
			System.out.println("");
		}
			
		
		
		System.out.println("To find the duplicates using array");
		int[] arr= {1,2,3,1,2,44};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(i==j)
				continue;
				
				else if(arr[i]==arr[j])
					System.out.println(arr[i] + "is duplicate");
			}
			
		}
		
		
	}
}

