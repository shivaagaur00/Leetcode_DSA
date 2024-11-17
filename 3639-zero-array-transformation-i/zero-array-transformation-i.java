class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        Arrays.sort(queries,(a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return a[1]-b[1];
        });
        int id=0;
        int n=nums.length;
        int len=queries.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<n;i++){
            while(id<len && queries[id][0]<=i && queries[id][1]>=i){
                pq.add(queries[id++]);
            }
            while(!pq.isEmpty() && pq.peek()[1]<i) pq.remove();
            if(pq.size()<nums[i]){
                return false;
            }
        }
        return true;
    }
}