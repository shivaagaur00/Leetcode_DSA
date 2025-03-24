class Solution {
    public int countDays(int days, int[][] meetings) {
        int ans=0;
        Arrays.sort(meetings,new Comparator<int[]>(){
            public int compare(int []arr,int[] arr2){
                if(arr[0]==arr2[0]) return Integer.compare(arr[1],arr2[1]);
                else return Integer.compare(arr[0],arr2[0]);
            }
        });
        int prev=0;
        for(int[] arr:meetings){
            if(arr[0]>prev+1) ans+=arr[0]-prev-1;
            prev=Math.max(prev,arr[1]);
        }
        ans+=days-prev;
    return ans;
    }
}