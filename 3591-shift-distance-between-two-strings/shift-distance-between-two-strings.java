class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        long[][] arr=new long[26][26];
        int n=s.length();
        for(long a[]:arr) Arrays.fill(a,Long.MAX_VALUE);
        for(int i=0;i<26;i++){
            int count=0;
            int idx=i;
            long cost=0;
            while(count++<26){
                int next=(idx+1)%26;
                int prev=(idx-1);
                if(prev<0) prev+=26;
                cost+=nextCost[idx];
                arr[i][next]=Math.min(arr[i][next],cost);
                idx++;
                idx%=26;
            }
        }
        for(int i=0;i<26;i++){
            int count=0;
            int idx=i;
            long cost=0;
            while(count++<26){
                int prev=(idx-1);
                if(prev<0) prev+=26;
                cost+=previousCost[idx];
                arr[i][prev]=Math.min(arr[i][prev],cost);
                idx--;
                if(idx<0) idx+=26;
            }
        }
        long ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=t.charAt(i)) ans+=arr[s.charAt(i)-'a'][t.charAt(i)-'a'];
        }
        return ans;
    }
}