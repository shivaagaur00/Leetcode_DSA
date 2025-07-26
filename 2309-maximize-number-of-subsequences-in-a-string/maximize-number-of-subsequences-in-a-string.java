class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long countFirst=0, countSecond=0, originalCount=0;
        for (char c:text.toCharArray()) {
            if (c==pattern.charAt(1)) {
                originalCount+=countFirst;
                countSecond++;
            }
            if (c == pattern.charAt(0)) {
                countFirst++;
            }
        }
        long option1 = originalCount + countSecond;
        long option2 = originalCount + countFirst;
        return Math.max(option1, option2);
    }
}
