class Solution {
    public int countPoints(String rings) {
        if(rings.length()==0) return 0;
        int[][] arr=new int[10][3];
        int ans=0;
        for(int i=1;i<rings.length();i+=2){
            if(rings.charAt(i-1)=='B') arr[Character.getNumericValue(rings.charAt(i))][2]++;
            else if(rings.charAt(i-1)=='G') arr[Character.getNumericValue(rings.charAt(i))][1]++;
            else arr[Character.getNumericValue(rings.charAt(i))][0]++;
        } 
        for(int i=0;i<10;i++){
            if(arr[i][0]>0 && arr[i][1]>0 && arr[i][2]>0) ans++;
        }
        return ans;
    }
}