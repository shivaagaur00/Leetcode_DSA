class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<String> st=new Stack<>();
        int n=s.length();
        int i=0;
        while(i<n){
            boolean flag=true;
            String temp="";
            char prev=s.charAt(i);
            while(i<n && s.charAt(i)==prev){
                temp+=prev;
                if(temp.length()==k){
                    temp="";
                }
                i++;
                flag=false;
            }
            if(temp.length()>0){
                if(!st.isEmpty() && st.peek().charAt(0)==prev){
                    String t=st.pop()+temp;
                    int kn=t.length()%k;
                    temp=t.substring(0,kn);
                }
                if(temp.length()>0) st.push(temp);
            }
            if(flag) i++;
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}