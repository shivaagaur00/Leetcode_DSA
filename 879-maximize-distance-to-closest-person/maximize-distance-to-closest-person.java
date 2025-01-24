class Solution {
    public int maxDistToClosest(int[] seats) {
        int max=0;
        int i=0;
        int pre=0;
        int n=seats.length;
        while(i<n && seats[i]==0){
            pre++;
            i++;
        }
        max=Math.max(pre,max);
        while(i<n){
            int k=i;
            pre=0;
            while(i<n && seats[i]==1){
                i++;
            }
            while(i<n && seats[i]==0){
                pre++;
                i++;
            }
            if(i==n){
                if(max<(pre)){
                max=Math.max(pre,max);
            }
            }
            else{
                if(pre%2!=0){
                    max=Math.max(max,(pre/2+1));
                }
                else{
                    max=Math.max(max,(pre/2));
                }
            }
        }
        return max;
    }
}