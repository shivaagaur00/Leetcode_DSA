class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        if(s.charAt(s.length()-1)=='1') return false;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        int start=0;
        int end=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            start=Math.max(temp+minJump,end+1);
            end=Math.min(temp+maxJump,n-1);
            for(int i=start;i<=end;i++){
                if(s.charAt(i)=='0'){
                    q.add(i);
                }
            }
            if(temp==(n-1)) return true;
        }
        return false;
    }
    // recursive approach
    // public boolean func(String s,int min,int max,int idx){
    //     if(idx>=s.length() || s.charAt(idx)!='0') return false;
    //     if(idx==(s.length()-1)) return true;
    //     for(int i=min;i<=max;i++){
    //         if(func(s,min,max,idx+i)) return true;
    //     }
    //     return false;
    // }
}