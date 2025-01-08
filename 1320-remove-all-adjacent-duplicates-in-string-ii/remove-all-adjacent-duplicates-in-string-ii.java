class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<String> st=new Stack<>();
        int n=s.length();
        int i=0;
        while(i<n){
            boolean flag=true;
            StringBuilder temp=new StringBuilder("");
            char prev=s.charAt(i);
            while(i<n && s.charAt(i)==prev){
                temp.append(prev);
                if(temp.length()==k){
                    temp=new StringBuilder("");
                }
                i++;
                flag=false;
            }
            if(temp.length()>0){
                if(!st.isEmpty() && st.peek().charAt(0)==prev){
                    String t=st.pop()+temp;
                    int kn=t.length()%k;
                    temp=new StringBuilder(t.substring(0,kn));
                }
                if(temp.length()>0) st.push(temp.toString());
            }
            if(flag) i++;
        }
        StringBuilder ans=new StringBuilder("");
        while(!st.isEmpty()){
            ans.insert(0,st.pop());
        }
        return ans.toString();
    }
}