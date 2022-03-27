import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);

		System.out.println("enter first number");
		int x = read.nextInt();
		System.out.println("enter second number");
		int y = read.nextInt();

		System.out.println("a=" + x);
		System.out.println("b=" + y);

		
		  System.out.println("swapping numbers are below"); 
		  x = x + y; 
		  y = x - y;
		  x = x- y; 
		  System.out.println("a=" + x); System.out.println("b=" + y);
		 
		
		System.out.println("swapping using temp variable");
		int temp=0;
		temp=x+y;
		x=temp-x;
		y=temp-y;
		System.out.println("a="+x);
		System.out.println("a="+y);
		
		
		
		
		
		

	}

}
