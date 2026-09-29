class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int idx=0;
        while (true) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    if (set.add(nums[i])) {
                        nums[i] = -1;

                    }
                }
            }
            System.out.println(set);
            

            ArrayList<Integer> list = new ArrayList<>();
            for (int a : set) {
                list.add(a);
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                ans[idx] = list.get(i);
                idx++;
            }
            boolean flag = true;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    flag = false;
                }
            }
            if (flag) {
                break;
            }

        }
        return ans;

    }
}