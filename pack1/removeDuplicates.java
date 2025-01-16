class Solution {
public static void main(String[] args) {
	int nums[] = new int[] {0,0,1,1,1,2,2,3,3,4};
	System.out.println(removeDuplicates(nums));
	for(int ele: nums) {
		System.out.print(ele+ " ");
	} 
public int removeDuplicates(int[] nums) {
        int indexunique = 0;
        for(int index=1; index<nums.length; index++){
            if(nums[index] != nums[index-1]){
                indexunique++;
                nums[indexunique] = nums[index];
            }
        }
        return indexunique+1;
    }
}
