class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> finalans = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int a : nums)
            set.add(a);
        List<Integer> ans = new ArrayList<>();
        for (int j = lower; j <= upper; j++) {
            if (!set.contains(j))
                ans.add(j);
        }
        int i = 0;
        while (i < ans.size()) {
            int start = ans.get(i);
            int end = start;
            while (i + 1 < ans.size() && ans.get(i + 1) == end + 1) {
                i++;
                end = ans.get(i);
            }
            List<Integer> group = new ArrayList<>();
            group.add(start);
            group.add(end);
            finalans.add(group);
            i++;
        }
        return finalans;
    }
}