class Solution {
    public int addMinimum(String word) {
        int n=word.length();
        if(n==1) return 2;
        int i=0;
        char prev='a';
        int ans=0;
        if(word.charAt(0)=='a') i=1;
        else ans++;
        if(word.charAt(n-1)=='a') ans+=2;
        else if(word.charAt(n-1)=='b') ans++;
        while(i<n){
            if(prev=='a'){
                if(word.charAt(i)=='b'){
                    i++;
                    prev='b';
                    continue;
                }
                else if(word.charAt(i)=='a'){
                    i++;
                    prev='a';
                    ans+=2;
                    continue;
                }
                else{
                    i++;
                    prev='c';
                    ans++;
                    continue;
                }
            }
            else if(prev=='b'){
                if(word.charAt(i)=='b'){
                    i++;
                    prev='b';
                    ans+=2;
                    continue;
                }
                else if(word.charAt(i)=='a'){
                    i++;
                    prev='a';
                    ans++;
                    continue;
                }
                else{
                    i++;
                    prev='c';
                    continue;
                }
            }
            else{
                if(word.charAt(i)=='c'){
                    i++;
                    prev='c';
                    ans+=2;
                    continue;
                }
                else if(word.charAt(i)=='a'){
                    i++;
                    prev='a';
                    continue;
                }
                else{
                    i++;
                    prev='b';
                    ans++;
                    continue;
                }
            }
        }
        return ans;
    }
}