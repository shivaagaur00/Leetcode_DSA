class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        for(int i=0;i<strs[0].length();i++){
            boolean flag=false;
            for(int j=1;j<strs.length;j++){
                if((strs[j].charAt(i)-'a')<(strs[j-1].charAt(i)-'a')){
                    flag=true;
                    // System.out.println(i+" "+j);
                    break;
                }
            }
            if(flag){
                ans++;
            }
        }
        return ans;
    }
}