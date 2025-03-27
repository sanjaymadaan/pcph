//Iterative Approach

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int reqarr[] = new int[nums1.length];
        Arrays.fill(reqarr, -1);
      for(int i =0; i<nums1.length; i++){
        int reqindex = -1;
        for(int j=0; j<nums2.length; j++){
            if(nums1[i] == nums2[j]){
                reqindex = j;
                break;
            }
        }
        for(int k = reqindex+1; k<nums2.length; k++){
            if(nums2[k] > nums1[i]){
                reqarr[i] = nums2[k];
                break;
            }
        }
      }
      return reqarr;
    }
}
