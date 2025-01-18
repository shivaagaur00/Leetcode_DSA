class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        long curr=mass;
        PriorityQueue<Integer> pq=new PriorityQueue<>(); 
        for(int a:arr){
            pq.add(a);
        }
        while(!pq.isEmpty()){
            if(curr>=pq.peek()) curr+=pq.poll();
            else return false;
        }
        if(pq.isEmpty()) return true;
        return false;
    }
}