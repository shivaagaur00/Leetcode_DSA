class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> map1=new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                map1.put(words[i].charAt(j),map1.getOrDefault(words[i].charAt(j),0)+1);
            }
            boolean flag=true;
            for(char ch:map1.keySet()){
                if(!map.containsKey(ch) || (map1.get(ch)>map.get(ch))){
                    flag=false;
                }
            }
            if(flag){
                ans+=words[i].length();
            }

        }
        return ans;
        
        
    }
}