class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long MOD = 1_000_000_007;
        for(int a:nums){
            pq.add(a);
        }
        while(k-->0){
            int temp=pq.poll();
            temp++;
            pq.add(temp);
        }
        long ans=1;
        while(!pq.isEmpty()){
            ans=ans * pq.poll() % MOD;
        }
        return (int)ans;
    }
}