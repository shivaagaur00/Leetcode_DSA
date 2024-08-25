class Solution {
    public int minimizedStringLength(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        return map.size();
    }
}