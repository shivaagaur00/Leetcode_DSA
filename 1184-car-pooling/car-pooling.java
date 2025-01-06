class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int count=0;
        Arrays.sort(trips, (a, b) -> {
            return a[1]-b[1];
            });
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[1]-b[1];
            }
        });
        int i=0;
        int n=trips.length;
        for(int[] trip:trips){        
            int passengers=trip[0];
            int start=trip[1];
            int end=trip[2];
            while(!pq.isEmpty() && pq.peek()[1]<=(start)){
                int[] temp=pq.poll();
                capacity+=temp[0];
            }
            if(capacity<passengers) return false;
            pq.add(new int[]{passengers,end});
            capacity-=passengers;
        }
        return true;
    }
}