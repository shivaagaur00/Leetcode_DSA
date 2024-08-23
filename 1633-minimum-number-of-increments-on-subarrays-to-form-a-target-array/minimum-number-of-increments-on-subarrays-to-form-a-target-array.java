class Solution {
    public int minNumberOperations(int[] target) {
        int ans=0;
        int count=0;
        for(int a:target){
            if(a>count){
                ans+=a-count;
            }
            count=a;
        }
        return ans;
    }
}