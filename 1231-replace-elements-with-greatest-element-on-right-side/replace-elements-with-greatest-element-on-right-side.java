class Solution {
    public int[] replaceElements(int[] arr) {
        int ans = -1;
        for (int i=arr.length-1;i>= 0;i--) {
            int currEl=arr[i];
            arr[i]=ans;
            ans=Math.max(ans,currEl);
        }
        return arr;
    }
}