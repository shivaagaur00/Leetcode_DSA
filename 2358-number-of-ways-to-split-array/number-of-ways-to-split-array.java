class Solution {
    public int waysToSplitArray(int[] nums) {
        long Leftsum= 0;
        long Rightsum= 0;
        for(int a:nums) Rightsum+=a;
        int ans=0;
        int i=0;
        for(int a:nums){
            Leftsum+=a;
            Rightsum-=a;
            if(Leftsum>=Rightsum) ans++;
            i++;
            if(i==(nums.length-1)) break;
        }   
        return ans;
    }
}