public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length <= 2){
            return nums.length;
        }
        
        int beg = 0;
        for(int i = 0;i < nums.length;i++){
            if(beg < 2 || nums[i] > nums[beg - 2]){
                nums[beg] = nums[i];
                beg++;
            }
        }
        
        return beg;
        
    }
}
