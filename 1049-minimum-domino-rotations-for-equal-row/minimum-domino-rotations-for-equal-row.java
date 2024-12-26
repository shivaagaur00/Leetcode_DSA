class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[][] arr=new int[tops.length][2];
        int a=-1;
        int n=tops.length;
        for(int i=0;i<tops.length;i++){
            arr[i][0]=tops[i];
            arr[i][1]=bottoms[i];
            if(tops[i]==bottoms[i]) a=tops[i];
        }
        if(a!=-1){
        for(int i=0;i<n;i++){
            if(!(arr[i][0]==a || arr[i][1]==a)) return -1;
        }
        }
        boolean give=true;
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=6;i++){
            boolean flag=true;
            int count1=0;
            int count2=0;
            for(int j=0;j<n;j++){
                if(arr[j][0]==i && arr[j][1]==i) continue;
                if(arr[j][0]==i) count1++;
                else if(arr[j][1]==i) count2++;
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans=Math.min(ans,Math.min(count1,count2));
                give=false;
            }
        }
        if(give) return -1;
        return ans;
    }
}