class Solution {
    public String sortString(String s) {
        int[] chars = new int[26];
        boolean flag = true;
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                chars[ch - 'a']++;
            }
        }
        while (true) {
            boolean flag2 = false;
            for (int a : chars) {
                if (a != 0) {
                    flag2 = true;
                }
            }
            if (!flag2) break;
            if (flag) {
                for (int i = 0; i < chars.length; i++) {
                    if(chars[i]!=0){
                        result.append((char)(i+'a'));
                        chars[i]--;
                    }
                }
                flag = false;
            } else {
                for (int i = chars.length - 1; i >= 0; i--) {
                    if(chars[i]!=0){
                        result.append((char) (i + 'a'));
                        chars[i]--;
                    }
                }
                flag = true;
            }
        }
        return result.toString();
    }
}