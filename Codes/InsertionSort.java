package com.company.sorting;

public class InsertionSort {
	public static void display(int arr[]) {
		System.out.println("\nArray Elements:");
		for(int index = 0; index < arr.length; index++) {
			System.out.printf("%d ", arr[index]);
		}
	}
	public static void insertionSort(int arr[]) {
//		Algorithm
//		Assume the first element is already sorted.
//		Pick the next element (called the currentElement).
//		Compare the currentElement with the elements before it.
//		Shift all elements greater than the currentElement 
		//one position to the right.
//		Insert the currentElement into its correct position.
//		Repeat until all elements are sorted.
		for(int index = 1; index < arr.length; index++) {
			int currentElement = arr[index];
			int prevIndex = index - 1;
			
			while(prevIndex >= 0 && arr[prevIndex] > currentElement) {
					arr[prevIndex + 1] = arr[prevIndex];
					prevIndex--;
			}
			arr[prevIndex + 1] = currentElement;
		display(arr);
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {79,34,24,68,36,99,23,11,64};
		
		display(arr);
		System.out.println("\n=======");
		insertionSort(arr);
		System.out.println("\n=======");

		display(arr);
	}

}
