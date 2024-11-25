class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source==target)
            return 0;
        int max=-1;
        for (int a[]:routes) {
            for (int b:a)
                max=Math.max(max,b);
        }
        if (max<target || max<source)
            return -1;
        int n=routes.length;
        int arr[]=new int[max+1];
        Arrays.fill(arr,n+1);
        arr[source]=0;
        boolean flag=true;
        while (flag){
            flag=false;
            for (int[] a:routes) {
                int min=n+1;
                for (int b:a) {
                    min =Math.min(min,arr[b]);
                }
                min++;
                for (int b:a) {
                    if (arr[b]>min) {
                        arr[b]=min;
                        flag=true;
                    }
                }
            }
        }
        return (arr[target]<n+1?arr[target]:-1);
    }
}