class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> set=new HashSet<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a:nums){
            set.add(a);
            pq.add(a);
        }
        int ans=-1;
        while(!set.isEmpty() && !pq.isEmpty()){
            int a=pq.poll();
            int count=0;
            while(set.contains(a)){
                set.remove(a);
                a*=a;
                count++;
            }
            if(count>=2) ans=Math.max(ans,count);
        }
    return ans;
    }
}