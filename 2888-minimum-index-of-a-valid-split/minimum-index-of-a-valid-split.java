class Solution {
    public int minimumIndex(List<Integer> nums) {
       int dominant=nums.get(0);
       int max=0;
       int n=nums.size();
       for(int i=0;i<n;i++){
        if(nums.get(i)==dominant){
            max++;
        }
        else{
            max--;
        }
        if(max<=0){
            dominant=nums.get(i);
            max=1;
        }
        // System.out.println(dominant+" "+max);
       }
       int totalDominantCount = 0;
        for (int num : nums) {
            if (num == dominant) totalDominantCount++;
        }
        System.out.println(dominant);
        // if (totalDominantCount * 2 <= n) return -1;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums.get(i)==dominant) count++;
            if(count>(i+1)/2 && (totalDominantCount-count)>((n-i-1)/2)) return i;
            // System.out.println((count>(i+1))+" "+count);
        }
       return -1;

    }
}