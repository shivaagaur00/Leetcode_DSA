class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[][]min=new int[timePoints.size()][2];
        int idx=0;
        for(String s:timePoints){
            min[idx][0]=(Integer.parseInt(s.substring(0,2))*60)+Integer.parseInt(s.substring(3,5));
            min[idx][1]=1440-min[idx][0];
            idx++;
        }
        Arrays.sort(min,(a,b) -> a[0] - b[0]);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<min.length;i++){
            for(int j=i+1;j<min.length;j++){
            ans=Math.min(ans,(Math.abs(min[i][0]+min[j][1])));
            ans=Math.min(ans,(Math.abs(min[i][1]-min[j][1])));
            ans=Math.min(ans,(Math.abs(min[i][0]-min[j][0])));
            ans=Math.min(ans,(Math.abs(min[i][1]+min[j][0])));
            }
        }
        return ans;
    }
}