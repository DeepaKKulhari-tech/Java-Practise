package com.practise.java;

public class AddToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1111
		// 1101
		// sum 11100
		// addfirstMethod(1111,1101);
		System.out.println(SecondMethod("111", "111"));
		// 1110

	}

	public static StringBuilder SecondMethod(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0) {
			int sum = carry;
			sum += a.charAt(i) - '0';
			sum += b.charAt(i) - '0';
			sb.append(sum % 2);//main logic
			carry = sum / 2;
			i--;
			j--;
			
		}
		if (carry != 0)
			sb.append(carry);
		return sb.reverse();

	}

	public static void addfirstMethod(int x, int y) {

		int sum = 0;
		int[] arr = new int[5];
		int i = 4;
		int carry = 0;

		while (x != 0) {
			carry = 0;

			int rem_x = x % 10;
			int rem_y = y % 10;
			if (rem_x == 1 && rem_y == 1)
				carry = 1;

			// variable = (condition) ? expression1 : expression2

			sum = (rem_x == 0 && rem_y == 0) || (rem_x == 1 && rem_y == 1) ? 0 : 1;

			if (i != 4) {
				if (carry == 1)
					sum = (sum == 1 && carry == 1) ? 0 : 1;
			}

			arr[i] = sum;
			i--;

			x = x / 10;
			y = y / 10;

			arr[0] = carry;
		}

		for (int k = 0; k < arr.length; k++)
			System.out.print(arr[k]);

	}

}
