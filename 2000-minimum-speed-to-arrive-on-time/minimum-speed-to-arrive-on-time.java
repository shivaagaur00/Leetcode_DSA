class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int start=1,end=10000007,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(check(dist,hour,mid)){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    public boolean check(int[] arr,double hour,double speed){
        double time=0;
        for(int i=0;i<arr.length-1;i++){
            time+=Math.ceil((double)arr[i]/speed);
        }
        time+=((double)arr[arr.length-1]/speed);
        return time<=hour;
    }
}