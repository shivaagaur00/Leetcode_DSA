class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans=new int[n];
        Arrays.sort(bookings,(a,b)->{
            return a[1]-b[1];
        });
        for(int[] arr:bookings){
            int start=arr[0];
            int end=arr[1];
            int seats=arr[2];
            ans[start-1]+=seats;
            if(end!=n)ans[end]-=seats;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=ans[i];
            ans[i]=sum;
        }
        return ans;
    }
}