class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr=new int[]{-1,-1,-1};
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1) ans+=1+Math.min(arr[0],Math.min(arr[1],arr[2]));
        }
        return ans;
    }
}