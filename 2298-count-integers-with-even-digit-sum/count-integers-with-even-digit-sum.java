class Solution {
    public int countEven(int num) {
        int ans=0;
        for(int i=2;i<=num;i++){
            if(sumEl(i)) ans++;
        }

        return ans;
    }
    public boolean sumEl(int num){
        int sum=0;
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        if(sum%2==0) return true;
        return false;
    }
}