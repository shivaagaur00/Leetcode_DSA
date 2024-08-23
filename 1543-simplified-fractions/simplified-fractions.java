class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans=new ArrayList<>();
        while(n>1){
            for(int i=n-1;i>0;i--){
                if(gcd(i,n)==1) ans.add(""+i+"/"+n);

            }
            n--;
        }
        return ans;
    }
public int gcd(int a, int b) {
    int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
    return result;
}
}