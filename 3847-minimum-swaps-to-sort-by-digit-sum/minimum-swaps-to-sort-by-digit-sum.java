class Solution {
    int sum(int num) {
        int s=0;
        while (num>0) {
            s+=num % 10;
            num/= 10;
        }
        return s;
    }
    int solve(int[] nums, int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=nums[i]){
                int id=map.get(arr[i]);
                int t=id;
                int tVal=nums[i];
                map.put(arr[i],i);
                map.put(nums[i],id);
                nums[i]=arr[i];
                nums[id]=tVal;
                count++;
            }
        }
        return count;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sum(nums[i]);
            arr[i][1] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; 
            return a[1] - b[1]; 
        });
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i][1];
        }
        return solve(nums, temp);
    }
}