package com.company.searching;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int target) {
		int leftindex = 0;
		int rightindex = arr.length-1;
		int atIndex = -1;

		while(leftindex <= rightindex) {
			//System.out.println("Find mid for : " + leftindex + " " + rightindex);
			
			int mid = (leftindex + rightindex)/2;
			
			//System.out.println("mid = " + mid);
			if(arr[mid] == target) {
				atIndex = mid;
				break;
			}else if(target < arr[mid]) {
				rightindex = mid - 1;
			}else if( target > arr[mid]) {
				leftindex = mid + 1;
			}
		}
		return atIndex;
	}
public static void main(String[] args) {
	int arr[] = {23,45,67,78,79,83,86,92,96,99,100,120,130};
	int target = 100;
	
	int reqIndex = binarySearch(arr, target);

	if(reqIndex == -1) {
		System.out.printf("%d %s", target, 
				"not present in array");
	}else {
		System.out.printf("%d %s %d", target, 
				"present in array at index", reqIndex);
	}
}
}
