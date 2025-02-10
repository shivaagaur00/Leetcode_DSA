import java.util.Arrays;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int i=0;
        int max=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        while(i<n){
                char c=s.charAt(i);
                if(map.containsKey(c) && map.get(c)>=l){
                    l=map.get(c)+1;
                }
                map.put(c,i);
                max=Math.max(max,i-l+1);
                i++;
            }
        return max;
    }
}
