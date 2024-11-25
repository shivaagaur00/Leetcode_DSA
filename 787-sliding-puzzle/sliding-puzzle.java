class Solution {
    public int slidingPuzzle(int[][] board) {
        int dir[][]={{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        Set<String> vis=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        String st="";
        for(int a[]:board){
            for(int b:a){
               st+=b; 
            }
        }
        int ans=0;
        q.offer(st);
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                String curr=q.poll();
                if(curr.equals("123450")) return ans;
                int pos=curr.indexOf("0");
                for(int i:dir[pos]){
                    StringBuilder s=new StringBuilder(curr);
                    s.setCharAt(pos,s.charAt(i));
                    s.setCharAt(i,'0');
                    if(!vis.contains(s.toString())){
                        vis.add(s.toString());
                        q.offer(s.toString());
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}