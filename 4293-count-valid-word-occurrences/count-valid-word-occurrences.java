class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        int[] ans=new int[queries.length];
        StringBuilder st=new StringBuilder();
        for(String s:chunks){
            st.append(s);
        }
        String s=st.toString().trim();
        boolean flag=true;
        StringBuilder temp1=new StringBuilder();
        for(char c:s.toCharArray()){
            if(flag && c=='-') continue;
            else{
                flag=false;
                temp1.append(c);
            }
        }
        flag=true;
        s=temp1.toString();
        temp1=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(flag && s.charAt(i)=='-') continue;
            else{
                flag=false;
                temp1.append(s.charAt(i));
            }
        }
        temp1.reverse();
        s=temp1.toString();
        temp1=new StringBuilder();
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(i==0 || i==s.length()-1){
                temp1.append(s.charAt(i));
                continue;
            }
            if(s.charAt(i)=='-' && s.charAt(i-1)-'a'>=0 && s.charAt(i-1)-'a'<26 && s.charAt(i+1)-'a'>=0 && s.charAt(i+1)-'a'<26){
                // System.out.println(s.charAt(i-1)+" "+(s.charAt(i+1)-'a'));
                temp1.append(s.charAt(i));
            }
            else if(s.charAt(i)=='-') temp1.append(" ");
            else temp1.append(s.charAt(i));
        }
        Map<String,Integer> map=new HashMap<>();
        String arr[]=temp1.toString().split(" ");
        for(String stt:arr){
            map.put(stt,map.getOrDefault(stt,0)+1);
        }
        int i=0;
        for(String stt:queries){
            ans[i++]=map.getOrDefault(stt,0);
        }
        return ans;
    }
}