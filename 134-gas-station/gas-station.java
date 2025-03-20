class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int curr=0;
        int ans=-1;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            total+=diff;
            curr+=diff;
            if(curr<0){
                curr=0;
                ans=i;
            }
        }   
        if(total>=0) return ans+1;
        return -1;
    }
}