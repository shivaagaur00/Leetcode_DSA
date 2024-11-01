class Solution {
    public String makeFancyString(String s) {
        int count=0;
        char prev='#';
        StringBuilder ans=new StringBuilder("");
        for(char c:s.toCharArray()){
            if(c!=prev){
                ans.append(c);
                count=1;
            }
            else{
                count++;
                if(count<3){
                    ans.append(c);
                }
            }
            prev=c;
        }
        return ans.toString();
    }
}