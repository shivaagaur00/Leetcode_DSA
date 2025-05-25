class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String st : words) {
            map.put(st, map.getOrDefault(st,0)+1);
        }
        int ans = 0;
        boolean hasCenter = false;
        for (String word:new HashSet<>(map.keySet())) {
            String rev=new StringBuilder(word).reverse().toString();
            if (word.equals(rev)) {
                int count=map.get(word);
                ans+=(count/2)*4;
                if (count%2==1) hasCenter = true;
            } else if (map.containsKey(rev)) {
                int pairs = Math.min(map.get(word), map.get(rev));
                ans+=pairs*4;
                map.put(rev,0);
            }
        }
        if (hasCenter) ans += 2;
        return ans;
    }
}