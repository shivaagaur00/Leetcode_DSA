class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,Integer> map=new HashMap<>();
        int id=0;
        for(List<String> st:knowledge){
            map.put(st.get(0),id++);
        }   
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='(') ans+=s.charAt(i);
            else{
                i++;
                String temp="";
                while(i<s.length() && s.charAt(i)!=')'){
                    temp+=s.charAt(i);
                    i++;
                }
                if(map.containsKey(temp)){
                    ans+=knowledge.get(map.get(temp)).get(1);
                }
                else ans+="?";
            }
        }
        return ans;
    }
}