class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int j=piles[0];
        for(int a:piles) j=Math.max(j,a);
        int i=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            int cal=func(mid,piles);
            if(cal>h){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }
    public int func(int a,int[] arr){
        int ans=0;
        for(int el:arr){
            ans+=Math.ceil((double)(el) / (double)(a));
        }
        return ans;
    }
}