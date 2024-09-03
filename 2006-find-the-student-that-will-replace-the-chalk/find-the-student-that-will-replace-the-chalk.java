class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int a:chalk) sum+=a;
        sum=k%sum;
        int i=0;
        while(sum>=0){
            if(sum==0 || sum<chalk[i]) return i;
            sum-=chalk[i++];
        }
        return i;
        }
}