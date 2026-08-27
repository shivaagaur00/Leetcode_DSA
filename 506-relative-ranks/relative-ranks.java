class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans=new String[score.length];
        int[] newtemp=new int[score.length];
        for(int i=0;i<score.length;i++){
            newtemp[i]=score[i];
        }
        Arrays.sort(newtemp);
        int last=newtemp.length-1;
        int[] temp= new int[newtemp.length];
        for(int i=0;i<temp.length;last--,i++){
            temp[i]=newtemp[last];
        }
        for(int i=0;i<score.length;i++){
            if(score[i]==temp[0]){
                ans[i]="Gold Medal";
            }
            else if(score[i]==temp[1]){
                ans[i]="Silver Medal";
            }
            else if(score[i]==temp[2]){
                ans[i]="Bronze Medal";
            }
            else{
                for(int j=0;j<temp.length;j++){
                    if(score[i]==temp[j]){
                        ans[i]=""+(j+1);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}