class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> arr=new ArrayList<>();
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                if(a[0]==b[0]) return a[1]-b[1];
                else return a[0]-b[0];
            }
        });
        int start=intervals[0][0];
        int prev=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>prev){
                int[] temp={start,prev};
                arr.add(temp);
                start=intervals[i][0];
                prev=Math.max(prev,intervals[i][1]);
            }
            else{
                prev=Math.max(prev,intervals[i][1]);
            }
        }

        arr.add(new int[]{start,prev});
        int[][] ans=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}