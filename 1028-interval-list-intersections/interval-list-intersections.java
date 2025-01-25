class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> arr=new ArrayList<>();
        int n=firstList.length;
        int m=secondList.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int a=Math.max(firstList[i][0],secondList[j][0]);
                int b=Math.min(firstList[i][1],secondList[j][1]);
                if((a<=firstList[i][1] && a>=firstList[i][0] && a<=secondList[j][1] && a>=secondList[j][0]) 
                && (b<=firstList[i][1] && b>=firstList[i][0] && b<=secondList[j][1] && b>=secondList[j][0])) {
                    arr.add(new int[]{a,b});
                }
            }
        }
        int ans[][]=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            ans[i][0]=arr.get(i)[0];
            ans[i][1]=arr.get(i)[1];
        }
        return ans;
    }
}