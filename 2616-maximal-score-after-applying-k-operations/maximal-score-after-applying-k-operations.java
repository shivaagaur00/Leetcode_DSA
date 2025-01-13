class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:nums) pq.add(a);
        long ans=0;
        while(k-->0){
            int a=pq.poll();
            ans+=a;
            pq.add((int)Math.ceil(a/3.0));
        }
        return ans;
    }
}