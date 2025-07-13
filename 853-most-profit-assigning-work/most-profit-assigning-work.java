class Solution {
    public int maxProfitAssignment(int[] diff, int[] prof, int[] worker) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                if (a.diff == b.diff)
                    return b.prof - a.prof;
                return a.diff - b.diff;
            }
        });
        int n = prof.length;

        for (int i = 0; i < n; i++) {
            pq.add(new Pair(diff[i], prof[i]));
        }
        Map<Integer,Integer> map=new HashMap<>();
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            map.put(p.diff,Math.max(map.getOrDefault(p.diff,0),p.prof));
        }
        Arrays.sort(diff);
        int max=0;
        for(int a:diff){
            max=Math.max(max,map.get(a));
            map.put(a,max);
        }    
        int ans=0;
        int prev=0;
        
        Arrays.sort(worker);
        int i=0;
        for(int a:worker){
            while(i<diff.length && diff[i]<=a){
                i++;
            }
            i--;
            if(i<0){
                i=0;
                continue;
            }
            ans+=map.get(diff[i]);
        }  
        return ans;
    }
}

class Pair {
    int diff;
    int prof;

    Pair(int diff, int prof) {
        this.diff = diff;
        this.prof = prof;
    }
}