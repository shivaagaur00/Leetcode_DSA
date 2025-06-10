class Solution {
    public int maxDifference(String s) {
        int ans=Integer.MIN_VALUE;
        int[] ar=new int[26];
        for(char c:s.toCharArray()){
            ar[c-'a']++;
        }
        int count=0;
        for(int a:ar){
            if(a!=0) count++;
        }
        int[] ct=new int[count];
        int idx=0;
        for(int a:ar){
            if(a!=0) ct[idx++]=a;
        }
        Arrays.sort(ct);
        for(int i=0;i<count;i++){
            int k=count-1;
            boolean flag;
            if(ct[i]%2==0){
                flag=true;
            }
            else{
                flag=false;
            }
            while(k>=0){
                if(ct[k]%2==0 && !flag){
                    ans=Math.max(ans,ct[i]-ct[k]);
                    break;
                }
                else if(ct[k]%2!=0 && flag){
                    ans=Math.max(ans,ct[k]-ct[i]);
                    break;
                }
                k--;
            }
        }
        return ans;
    }
}