class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        if(n==1){
            arr.add(nums[0]);
            return arr;
        }
        n=n/3;
        int count1=0;
        int count2=0;
        int num1=Integer.MAX_VALUE;
        int num2=Integer.MAX_VALUE;
        for(int a:nums){
            if(a==num1) count1++;
            else if(a==num2) count2++;
            else if(count1==0){
                num1=a;
                count1=1;
            }
            else if(count2==0){
                num2=a;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }           
        }
        count1=0;
        count2=0;
        for(int a:nums){
            if(a==num1) count1++;
            if(a==num2) count2++;
        }
        if(count1>n) arr.add(num1);
        if(count2>n) arr.add(num2);
        return arr;
    }
}