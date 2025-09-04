class Solution {
    public int findClosest(int x, int y, int z) {
        int a=Math.abs(z-x)-Math.abs(z-y);
        if(a>0) return 2;
        else if(a<0) return 1;
        return  0;
    }
}