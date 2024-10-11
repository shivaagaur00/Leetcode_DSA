class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
     
         int n = times.length;
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) order[i] = i;

        Arrays.sort(order, (a, b) -> Integer.compare(times[a][0], times[b][0]));
        PriorityQueue<Integer> que=new PriorityQueue<>();
        PriorityQueue<int[]> arr=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<times.length;i++) que.add(i);
        for(int i:order){
            int arrival=times[i][0];
            int dep=times[i][1];
            while(!arr.isEmpty() && arr.peek()[0]<=arrival){
                que.add(arr.poll()[1]);
            }
            if(i==targetFriend) return que.poll();
            arr.add(new int[]{dep,que.poll()});
        }
        return -1;

    }
}