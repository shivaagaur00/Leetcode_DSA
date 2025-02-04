class Solution {
    public boolean hasMatch(String s, String p) {
        String[] parts = p.split("\\*", -1);
        if (parts.length > 2) return false;
        String pre = parts[0];
        String suf = parts.length > 1 ? parts[1] : "";
        int idx = s.indexOf(pre);
        if (idx == -1) return false;
        String rem = s.substring(idx + pre.length());
        return rem.contains(suf);
    }
}
