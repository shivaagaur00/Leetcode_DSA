class Solution {
    public int minOperations(int[] nums, int k) {
       PriorityQueue<Long> pq=new PriorityQueue<>();
       for(int a:nums) pq.add((long)a);
       int ans=0;
       while(pq.size()>1 && pq.peek()<k){
        ans++;
        long a=pq.poll();
        long b=pq.poll();
        pq.add(a*2+b);
       } 
       return ans;
    }
}