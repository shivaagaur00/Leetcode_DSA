class Solution {
    public long minimumTime(int[] time, int total) {
        Arrays.sort(time);
        long ans=0;
        long j=(long)time[0]*total;
        long i=1;
        while(i<=j){
            long mid=i+(j-i)/2;
            if(func(mid,time,total)){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
    public boolean func(long time,int[] arr,long total){
        long ans=0;
        for(int a:arr){
            if(a>time){
                break;
            }
            ans+=time/a;
            if(ans>total){
                return true;
            }
        }
        if(ans<total) return false;
        return true;
    }
}