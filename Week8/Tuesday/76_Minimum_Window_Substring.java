public class Solution {
    public String minWindow(String s, String t) {
        //base case/corner case
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || t.length() > s.length()){
            return new String();
        }
        
        int[] map = new int[128];
        int count = t.length();
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        
        //put all characters in t into map
        for(char c : t.toCharArray()){
            map[c]++;
        }
        
        char[] chS = s.toCharArray();
        while(end < chS.length){
            //move right to find a match
            if(map[chS[end]]-- > 0){
                end++;
                count--;
                
            }
            //move left when a match if found
            while(count == 0){
                if(end - start < minLen){
                    startIndex = start;
                    minLen = end - start;
                }
            if(map[chS[start]]++ == 0){
                start++;
                count++;
            }
                
            }
        }
        return minLen == Integer.MAX_VALUE ? new String():new String(chS,startIndex,minLen);
    }
}
