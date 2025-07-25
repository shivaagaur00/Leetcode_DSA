class Solution {
    public int maxSum(int[] nums) {
       Set<Integer> arr=new HashSet<>();
       int max=Integer.MIN_VALUE;
       for(int a:nums){
        if(a>0) arr.add(a);
        else max=Math.max(max,a);
       } 
       if(arr.size()==0) return max;
       int ans=0;
       for(int a:arr){
        ans+=a;
       }
       return ans;
    }
}