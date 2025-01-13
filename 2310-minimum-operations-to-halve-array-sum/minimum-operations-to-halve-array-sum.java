class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        Double sum = 0.0;
        for (int a : nums) {
            pq.add((double) a);
            sum += a;
        }
        int ans = 0;
        Double half = sum / 2;
        while (sum > half) {
            ans++;
            double ab = pq.poll() / 2;
            sum -= ab;
            pq.offer(ab);
        }
        return ans;
    }
}