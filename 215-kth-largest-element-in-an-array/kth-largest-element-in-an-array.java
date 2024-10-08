class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int a:nums){
            pq.add(a);
        }
        while(k-->1)pq.poll();
        return pq.poll();
    }
}