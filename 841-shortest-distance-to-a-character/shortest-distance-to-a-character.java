class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]=new int[s.length()];
        int ans1[]=new int[s.length()];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ans.length;i++){
            ans[i]=Integer.MAX_VALUE;
            ans1[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c){
                st.add(i);
            }
            else{
                int count=1;
                while(!st.isEmpty()){
                    ans[st.pop()]=count++;
                }
                ans[i]=0;
            }
        }
        st.clear();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=c){
                st.add(i);
            }
            else{
                int count=1;
                while(!st.isEmpty()){
                    ans1[st.pop()]=count++;
                }
                ans1[i]=0;
            }
        }

        for(int i=0;i<ans.length;i++){
            // System.out.print(ans1[i]+" ");
            ans[i]=Math.min(ans[i],ans1[i]);
        }
        return ans;
    }
}