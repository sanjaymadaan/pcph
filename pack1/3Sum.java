import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> list ;
     list = new ArrayList<List<Integer>>();

    Set<List<Integer>> set;
    set = new HashSet<List<Integer>>();
    Arrays.sort(nums);
    for(int i = 0; i<nums.length-2; i++){
        int j = i+1;
        int k = nums.length - 1;
        while(j<k){
         //   System.out.println(i +" " + j + " " + k);
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0){
                set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++; 
                k--;
            }else if(sum < 0){
                j++;
            }else{
                k--;
            }
        }
    }

    list.addAll(set);



     return list;
    }
}
