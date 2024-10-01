class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] count=new int[k];
        for(int a:arr){
            int r=a%k;
            if(r<0) r=r+k;
            count[r]++;
        }
        if(count[0]%2!=0) return false;
        for(int i=1;i<=k/2;i++){
            if(count[i]!=count[k-i]) return false;
        }
        return true;
    }
}