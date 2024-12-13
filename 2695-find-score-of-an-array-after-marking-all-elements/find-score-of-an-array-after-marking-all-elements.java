class Solution {
    public long findScore(int[] nums) {
        long ans=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return a[0]==b[0]?a[1]-b[1]:a[0]-b[0];
            }
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        boolean[] arr=new boolean[nums.length];
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            // while(!pq.isEmpty() && pq.peek()[0]==temp[0]) pq.poll();
            if(arr[temp[1]]){
                continue;
            }
            else{
                if((temp[1]-1)>=0) arr[temp[1]-1]=true;
                if((temp[1]+1)<arr.length) arr[temp[1]+1]=true;
                arr[temp[1]]=true;
                ans+=temp[0];
            }
        }
        return ans;
    }
}