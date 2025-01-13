package pack1;

import java.util.ArrayList;

public class MoveZeroes {
	public static void main(String[] args) {
		int nums[] = new int[] {0,1,0,3,12};
		display(nums);
//		moveZeroes(nums);
		moveZeroesN(nums);
		display(nums);
	}
	static public void display(int[] nums) {
		for(int ele: nums) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	static public void moveZeroesN(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                System.out.print("Left = " + left);
                System.out.print(" Right = " + right +"    ");

            	int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;

                display(nums);
            }else {
            	System.out.print("Left = " + left);
                System.out.print(" Right = " + right +"    ");

                display(nums);
            	
            }
        }        
    }
	static public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0)
                count++;
            else
                list.add(nums[i]);
        }
        for(int i=0; i< count; i++){
            list.add(0);
        }
      
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i); // Unbox Integer to int
        }

    }
}