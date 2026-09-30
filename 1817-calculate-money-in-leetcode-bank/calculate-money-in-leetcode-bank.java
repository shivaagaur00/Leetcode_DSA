class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int idx=1;
        int temp=1;
        int last=8;
        while(n>0){
            sum+=idx;
            idx++;
            if(idx==last){
                idx=temp+1;
                temp++;
                last++;
            }
            n--;
        }
    return sum;
    }
}