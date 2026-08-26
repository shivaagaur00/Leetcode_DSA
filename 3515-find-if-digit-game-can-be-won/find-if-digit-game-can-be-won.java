class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        for(int a:nums){
            if(a>9) sum-=a;
            else sum+=a;
        }  
        if(sum!=0) return true;
        return false;
    }

}