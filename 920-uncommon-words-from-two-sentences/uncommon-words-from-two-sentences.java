class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map=new HashMap<>();
        List<String> tempLs=new ArrayList<>();
        String[] temp1=s1.split(" ");
        String[] temp2=s2.split(" ");
        for(String s:temp1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:temp2){
            map.put(s,map.getOrDefault(s,0)+1);
        }      
        for(String s:map.keySet()){
            if(map.get(s)==1) tempLs.add(s);
        }  
        String[] ans=new String[tempLs.size()];
        for(int i=0;i<tempLs.size();i++){
            ans[i]=tempLs.get(i);
        }
        return ans;
    }
}