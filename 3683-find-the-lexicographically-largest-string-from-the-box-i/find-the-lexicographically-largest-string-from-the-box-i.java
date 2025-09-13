class Solution {
    public String answerString(String word, int numFriends) {
        int n = word.length();
        if (n == 1) return word;
        int k = n - numFriends + 1;
        int minLen = (numFriends == 1 ? n : 1);
        char maxChar = 'a';
        for (int i = 0;i<n-minLen+1; i++) {
            if (word.charAt(i) > maxChar) {
                maxChar = word.charAt(i);
            }
        }
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) == maxChar) {
                int end = Math.min(i + k, n);
                String candidate = word.substring(i, end);
                if (candidate.length() >= minLen && candidate.compareTo(ans) > 0) {
                    ans = candidate;
                }
            }
        }
        return ans;
    }
}
