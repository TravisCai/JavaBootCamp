public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        char[] str  = s.toCharArray();
        int[] map = new int[256];
        
        int max = 0;
        int beg = 0;
        
        for(int i = 0;i < s.length();i++){
            if(map[str[i]] == 0){
                max = Math.max(max,i - beg + 1);
            }else{
                beg = Math.max(beg,map[str[i]]);
                max = Math.max(max,i - beg + 1);
            }
            map[str[i]] = i +1;
        }
        return max;
    }
}
