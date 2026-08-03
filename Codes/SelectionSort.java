package com.company.sorting;

public class SelectionSort {
	
	public static void display(int arr[]) {
		System.out.println("\nArray Elements:");
		for(int index = 0; index < arr.length; index++) {
			System.out.printf("%d ", arr[index]);
		}
	}
	
	public static void selectionSort(int arr[]) {
		//Algorithm
		//Assume the first element is the minimum. (i)
		//Compare it with the remaining elements. (j)
		//Find the smallest element. (MinIndex)
		//Swap it with the first element. (i, MinIndex)
		//Move to the next position and repeat until the array is sorted.
		int minIndex = -1;
		
		for(int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			//Swap
			int reqValue = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = reqValue;
			display(arr);
		}
	}
	public static void main(String[] args) {
	
	int arr[] = {9, 24, 13, 26, 3, 6, 2};
	
	display(arr);
	
	selectionSort(arr);
	
	display(arr);
}
	
}



