public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
            return res;
        }
        
        helper(res,new ArrayList<Integer>(),nums,new boolean[nums.length]);
        return res;
        
    }
    
    private void helper(List<List<Integer>> res,List<Integer> path,int[] nums,boolean[] isVisited){
        if(path.size() == nums.length){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        
        for(int i = 0;i < nums.length;i++){
            if(isVisited[i]){
                continue;
            }
            path.add(nums[i]);
            isVisited[i] = true;
            helper(res,path,nums,isVisited);
            path.remove(path.size() - 1);
            isVisited[i] = false;
        }
        return;
    }
}
