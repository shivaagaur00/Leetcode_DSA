class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int count=0;
        int ans=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==0) ans+=1;
            else if(i==0 || answers[i]!=answers[i-1] || count==0){
                ans+=answers[i]+1;
                count=answers[i];
            }
            else count--;
        }
        return ans;
    }
}