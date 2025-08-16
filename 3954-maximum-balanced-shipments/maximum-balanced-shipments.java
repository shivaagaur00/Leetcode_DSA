class Solution {
    public int maxBalancedShipments(int[] weight) {
        int ans=0;
        int max=weight[0];
        int n=weight.length;
        for(int i=1;i<n;i++){
            if(weight[i]<max){
                ans++;
                if(i<n-1){
                    max=weight[i+1];
                }
            }
            else{
                max=Math.max(max,weight[i]);
            }
        }
        return ans;
    }
}