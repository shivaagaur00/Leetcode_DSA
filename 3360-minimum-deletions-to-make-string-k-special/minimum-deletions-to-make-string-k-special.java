class Solution {
    public int minimumDeletions(String word, int k) {
        int count[]=new int[26];
        int max=0;
        for(char c:word.toCharArray()){
            count[c-'a']++;
            max=Math.max(count[c-'a'],max);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=max;i++){
            int temp=0;
            for(int a:count){
                if(a<i) temp+=a;
                else if((a-i)>k){
                    temp+=a-i-k;
                }
            }
            ans=Math.min(ans,temp);
        }
        return ans;

    }
}