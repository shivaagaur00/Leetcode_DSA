class Solution {
    public int minimumLength(String s) {
        int ans=0;
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(int a:arr){
            if(a>0){
                if(a%2==0) ans+=2;
                else ans++;
            }
        }
        return ans;
    }
}