package NaveenQuestions;

import java.util.Arrays;

public class LargestAmongInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1000,33,33,344,100000000};
		
		System.out.println(Arrays.toString(arr));
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		
		System.out.println("largest: "+largest+ "\n"+ "smallest : "+smallest);
	}

}
