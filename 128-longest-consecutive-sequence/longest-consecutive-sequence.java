class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set = new HashSet<>();
        for (int a : nums) set.add(a);
        for(int a:set){
            int len=1;
            if(!set.contains(a-1)){
            int curr=a;
                while(set.contains(curr+1)){
                    len++;
                    curr++;
                }
            }
            max=Math.max(len,max);
        }
        return max;
    }
}