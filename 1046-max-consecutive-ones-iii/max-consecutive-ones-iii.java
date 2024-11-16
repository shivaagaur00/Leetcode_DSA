class Solution {
    public int longestOnes(int[] nums, int k) {
     int i=0,j=0,temp=0,ans=0,n=nums.length;
     while(j<n){
        if(nums[j]==1) j++;
        else if(temp<k){
            temp++;
            j++;
        }
        else if(nums[i]==1) i++;
        else{
            temp--;
            i++;
        }
        ans=Math.max(ans,j-i);
     }   
     return ans;
    }
}