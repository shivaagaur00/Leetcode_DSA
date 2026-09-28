class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<target.length();i++){
            map.put(target.charAt(i),map.getOrDefault(target.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map1= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                 map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int min=Integer.MAX_VALUE;
        for(char ch:map.keySet()){
            if(!map1.containsKey(ch)) return 0;
            min=Math.min(min,map1.get(ch)/map.get(ch));
        }
        return min;

        
        
    }
}