class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        String s=strs[0];
        for(int i=0;i<strs.length;i++){
            if(min>=strs[i].length()){
                s=strs[i];
            }
            min=Math.min(min,strs[i].length()); 
        }
        String m=""; 
        for(int i=0;i<min;i++){
            int count=0;
            for(int j=0;j<strs.length;j++){
                if(s.charAt(i)==strs[j].charAt(i)){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==strs.length){
                m+=s.charAt(i);
            }
            else{
                break;
            }
        }
        return m;        
    }
}