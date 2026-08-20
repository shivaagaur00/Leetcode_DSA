class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        int offset=5*n/100;
        int i=offset;
        int j=n-offset;
        double total=j-i;
        double ans=0;
        Arrays.sort(arr);
        for (int id=i;id<j;id++)
            ans+=arr[id];
        return ans/total;
    }
}