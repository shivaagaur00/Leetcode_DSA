class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int a:nums){
            if(a>0){
                set.add(a);
                max=Math.max(max,a);
            }
        }   
        if(set.isEmpty()) return 1;
        for(int i=1;i<max;i++){
            if(!set.contains(i)) return i;
        }
        return max+1;
    }
}