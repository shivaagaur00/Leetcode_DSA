class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<r.length();i++){
            map.put(r.charAt(i),map.getOrDefault(r.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map1 =new HashMap<>();
        for(int i=0;i<m.length();i++){
             map1.put(m.charAt(i),map1.getOrDefault(m.charAt(i),0)+1);
            
        }
        boolean flag=true;
        for(char ch:map.keySet()){
            if(!map1.containsKey(ch) || map1.get(ch)<map.get(ch)){
                flag=false;
            }
        }
        return flag;
        
    }
}