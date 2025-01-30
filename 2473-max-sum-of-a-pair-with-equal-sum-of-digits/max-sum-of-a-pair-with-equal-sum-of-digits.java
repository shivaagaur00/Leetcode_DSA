class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int a:nums) {
            int key=func(a);
            if (!map.containsKey(key)) map.put(key, a);
            else {
                result = Math.max(result,map.get(key)+a);
                map.put(key, Math.max(map.get(key), a));
            }
        }
        return result;
    }

    public int func(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }
}