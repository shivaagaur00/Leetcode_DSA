class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        char[] chArr=s.toCharArray();
        int arr[] =new int[n+1];
        for(int ar[]:shifts){
            int st=ar[0];
            int en=ar[1];
            int in=ar[2];
            if(in==1){
                arr[st]+=1;
                if(en+1<n)arr[en+1]-=1;
            }
            else{
                arr[st]-=1;
                if(en+1<n)arr[en+1]+=1;                
            }
        }
        int[] intArr=new int[n];
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        StringBuilder ans=new StringBuilder(s);
        for (int i=0;i<n;i++) {
            int shift=(arr[i]%26+26)%26;
            ans.setCharAt(i,(char)('a'+(s.charAt(i)-'a'+shift)%26));
        }
        return ans.toString();
    }
}