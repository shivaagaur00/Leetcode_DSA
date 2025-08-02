class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> diff = new HashMap<>();
        int minElem = Integer.MAX_VALUE;
        for (int x : basket1) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            diff.put(x, diff.getOrDefault(x, 0) + 1);
            minElem = Math.min(minElem, x);
        }
        for (int x : basket2) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            diff.put(x, diff.getOrDefault(x, 0) - 1);
            minElem = Math.min(minElem, x);
        }
        for (int val : freq.values()) {
            if (val % 2 != 0) return -1;
        }
        System.out.println(diff);
        List<Integer> extra = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : diff.entrySet()) {
            int val=Math.abs(entry.getValue()/2);
            int key = entry.getKey();
            for (int i = 0; i <val; i++) {
                    extra.add(key);
                }
        }
        Collections.sort(extra);
        System.out.println(extra);
        long cost = 0;
        int n = extra.size();
        for (int i = 0; i < n/2; i++) {
            cost += Math.min(extra.get(i), 2 * minElem);
        }

        return cost;
    }
}
