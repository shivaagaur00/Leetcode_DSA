class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        if (s.length() != t.length() || s.length() % k != 0) {
            return false;
        }
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        int n=s.length()/k;
        for(int i=0;i<s.length();i+=n){
            String st1=s.substring(i,i+n);
            String st2=t.substring(i,i+n);
            map1.put(st1,map1.getOrDefault(st1,0)+1);
            map2.put(st2,map2.getOrDefault(st2,0)+1);
        }
        return map1.equals(map2);
    }
}