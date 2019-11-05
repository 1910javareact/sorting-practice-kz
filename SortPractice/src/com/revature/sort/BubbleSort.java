package com.revature.sort;
public class BubbleSort {
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length - 1; i++) {
			int max = 0;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr [max] < arr[j]) {
					max =  arr[j];
					arr[j] = arr [j+1];
					arr [j +1] = max;
				}
			}
			void PrintArray(int j) {
				for (int i = 0; i < arr.length; ++i)
					System.out.println(arr[i] + " ");
				System.out.println();
			}
		}
	}
}