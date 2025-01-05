class Solution {
    public String getSmallestString(String s, int k) {
        int n=s.length();
        int[] arr=new int[n];
        int j=0;
        for(char ch:s.toCharArray()) arr[j++]=ch-97;
        j=0;
        while(k>0 && j<n){
            if(arr[j]==0){
                j++;
                continue;
            }
            int right=26-arr[j];
            int left=arr[j];
            if((arr[j]+k)>=26 && right<left){
                arr[j]=0;
                k-=right;
            }
            else{
                if((k)>=arr[j]){
                    k-=arr[j];
                    arr[j]=0;
                }
                else{
                    arr[j]-=k;
                    k=0;
                }
            }
            j++;
        }
        StringBuilder ans=new StringBuilder("");
        for(int a:arr) ans.append((char)(a+97));
        return ans.toString();

    }
}