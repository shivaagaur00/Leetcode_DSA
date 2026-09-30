class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int ans[] = new int[num_people];
        int idx = 1;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if(candies==0){
                    break;
                }
                if (candies < idx) {
                    ans[i] += candies;
                    candies = 0;
                } else {
                    ans[i] += idx;
                    candies = candies - idx;
                    idx++;
                }

            }
        }
        return ans;
    }
}