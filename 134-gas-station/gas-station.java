class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int curr=0;
        int id=-1;
        int n=gas.length;
        for(int i=0;i<n;i++){
            int diff=gas[i]-cost[i];
            sum+=diff;
            curr+=diff;
            if(curr<0){
                id=i;
                curr=0;
            }
        }
        return sum>=0?id+1:-1;
    }
}