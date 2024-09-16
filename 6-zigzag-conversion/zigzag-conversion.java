class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        List<List<Character>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++) ans.add(new ArrayList<>());
        boolean flag=true;
        int idx=0;
        while(s.length()!=0){
            ans.get(idx).add(s.charAt(0));
            s=s.substring(1);
            if(flag){
                if(idx==numRows-1){
                    idx--;
                    flag=false;
                }
                else idx++;
            }
            else{
                if(idx==0){
                    flag=true;
                    idx++;
                }
                else idx--;
            }
        }
        String st="";
        for(List<Character> arr:ans){
            for(char ch:arr) st+=ch;
        }
        return st;
    }
}