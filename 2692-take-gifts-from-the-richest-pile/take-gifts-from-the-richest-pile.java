class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:gifts) pq.add(a);
        int i=gifts.length-1;
        while(k-->0){
            pq.add((int)Math.sqrt(pq.poll()));
        }
        long ans=0;
        while(!pq.isEmpty()){
            int b=pq.poll();
            ans+=b;
        }
        return ans;
    }
}