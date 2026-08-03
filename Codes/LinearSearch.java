package com.company.searching;

public class LinearSearch {
		
	public static int linearSearch(int arr[], int target) {
		int atIndex = -1;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] == target) {
				atIndex = index;
				break;
			}
		}
		return atIndex;
	}
	public static void main(String[] args) {
		
		int arr[] = {435,45,567,86,45,34,2,46,67,68,53,24};
		int searchfor = 53;
		
		int reqIndex = linearSearch(arr, searchfor);
		if(reqIndex == -1)
		System.out.printf("%d %s",searchfor,"not found.");
		else
			System.out.printf("%d %s %d",searchfor,
					"found at index = ", reqIndex);
	}
}
