public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        if(nums == null || nums.length == 0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        helper(res,new ArrayList<Integer>(),nums,0);
        return res;
        
    }
 
    private void helper(List<List<Integer>> res,List<Integer> path,int[] nums,int pos){
        res.add(new ArrayList<Integer>(path));
        
        for(int i = pos;i < nums.length;i++){
            path.add(nums[i]);
            helper(res,path,nums,i+1);
            path.remove(path.size() - 1);
        }
        
        return;
    }
}
