class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> pq=new PriorityQueue<>((a,b)->Double.compare(a[0]/a[1], b[0]/b[1]));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                pq.add(new double[]{arr[i],arr[j]});
            }
        }
        while(k-->1){
            pq.poll();
        }
        double[] temp=pq.poll();
        int ans[]=new int[]{(int)(temp[0]),(int)(temp[1])};
        return ans;
    }
}