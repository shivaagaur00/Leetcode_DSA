class Solution {
    public int minOperations(int[] arr) {
        if(arr.length==1) return 0;
        int sum=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                sum+=arr[i-1]-arr[i]+1;
                arr[i]+=arr[i-1]-arr[i]+1;
            }
        }
        return sum;
        
    }
}