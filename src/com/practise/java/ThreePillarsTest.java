package com.practise.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreePillarsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5,7,3,4,6,1,2,4
		int[] arr = { 500, 4, 3, 10, 2, -6, 7, 8, 10, 20, 100, -10 };

		List<Integer> list = new ArrayList<Integer>();

		for (int i : arr) {
			list.add(i);

		}

		// int index = 0;
		int buy = Collections.min(list);

		int index = list.indexOf(buy);

		/*
		 * for (int j = 0; j < arr.length; j++) { if (arr[j] == buy) { index = j; }
		 */

		// }

		List<Integer> list2 = new ArrayList<Integer>();

		for (int m = index; m < arr.length; m++) {
			list2.add(arr[m]);
		}

		int sell = Collections.max(list2);

		int Profit = sell - buy;

		//System.out.println("Selling Price: " + sell);
		//System.out.println("Buying Price: " + buy);
		//System.out.println("Profit Gained: " + Profit);

		getProfit(arr);

	}

	public static int getMin(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getMax(int[] arr, int startIndex) {
		int max = arr[startIndex];

		if(startIndex==arr.length-1)
		{
			System.out.println("no selling yet");
			
			return arr[arr.length-1];
				
		}
		else
		{
		for (int i = startIndex + 1; i < arr.length; i++) {
			if (max < arr[i]) 
			{
				max = arr[i];
			}
		}
		return max;
		}
	}

	public static int getIndex(int[] arr, int num) {

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void getProfit(int[] arr) {
		int buy = getMin(arr);
		int day = getIndex(arr, buy);
		int sell = getMax(arr, day);
	
	
		System.out.println("buy amt: "+buy);
		System.out.println("sell amt: "+sell);
		System.out.println("Profit get :" + (sell - buy));

	}

}
