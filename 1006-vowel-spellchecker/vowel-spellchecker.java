import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();
        for (String word : wordlist) {
            exact.add(word);
            String lower = word.toLowerCase();
            caseMap.putIfAbsent(lower, word);
            String vowelNorm = devowel(lower);
            vowelMap.putIfAbsent(vowelNorm, word);
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {
                ans[i] = q;
            } else {
                String lower = q.toLowerCase();
                if (caseMap.containsKey(lower)) {
                    ans[i] = caseMap.get(lower);
                } else {
                    String vowelNorm = devowel(lower);
                    ans[i] = vowelMap.getOrDefault(vowelNorm, "");
                }
            }
        }
        return ans;
    }

    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
