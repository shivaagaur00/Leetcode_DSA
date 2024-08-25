class Solution {
    public int countAsterisks(String s) {
        String[] arr=s.split("\\|");
        int ans=0;
        int id=0;
        for(String st:arr){
            if(id%2==0){
            for(char c:st.toCharArray()){
                if(c=='*') ans++;
            }
            }  
            id++;
        }
        return ans;
    }
}