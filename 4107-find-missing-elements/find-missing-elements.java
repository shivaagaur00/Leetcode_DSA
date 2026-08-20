class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num:nums) {
            st.add(num);
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        List<Integer> ans=new ArrayList<>();
        for (int x=min;x<=max;x++) {
            if (!st.contains(x)) {
                ans.add(x);
            }
        }
        return ans;
    }
}