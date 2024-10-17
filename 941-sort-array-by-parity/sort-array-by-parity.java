class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int a:nums){
            if(a%2==0) even.add(a);
            else odd.add(a);
        }
        for(int j=0;j<even.size();j++) nums[j]=even.get(j);
        int i=0;
        for(int j=even.size();j<nums.length;j++) nums[j]=odd.get(i++);
        return nums;
    }
}