class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int a:bloomDay){
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        int ans=-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(check(bloomDay,m,k,mid)){
                max=mid-1;
                ans=mid;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] arr,int m,int k,int x){
        int total=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                count++;
            }
            else count=0;
            if(count==k){
                total++;
                count=0;
            }
        }
        return total>=m;
    }
}