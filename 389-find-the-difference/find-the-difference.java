class Solution {
    public char findTheDifference(String h, String s) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(i<h.length()){
            if (map1.containsKey(h.charAt(i))) {
                map1.put(h.charAt(i), map1.get(h.charAt(i)) + 1);
            } else {
                map1.put(h.charAt(i), 1);
            }
            }
            if (map2.containsKey(s.charAt(i))) {
                map2.put(s.charAt(i), map2.get(s.charAt(i)) + 1);
            } else {
                map2.put(s.charAt(i), 1);
            }
        }
        String ans="";
        for(char c:map2.keySet()){
            if(!map1.containsKey(c)){
                return c;
            }
            else{
                if(map1.get(c)<map2.get(c)){
                    return c;
                }
            }
        }
        return '1';
    }
}