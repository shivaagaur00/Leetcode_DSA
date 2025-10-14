public class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums,int k){
        int n=nums.size();
        if(n<2*k)return false;
        for(int i=0;i<=n-2*k;i++){
            if(func(nums,i,i+k-1)&&func(nums,i+k,i+2*k-1)){
                return true;
            }
        }
        return false;
    }

    public boolean func(List<Integer> nums,int i,int j){
        for(;i<j;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
