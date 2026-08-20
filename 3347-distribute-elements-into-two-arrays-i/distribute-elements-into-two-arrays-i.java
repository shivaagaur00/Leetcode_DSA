class Solution {
    public int[] resultArray(int[] nums) {
        int i=1;
        int a=nums[0];
        int b=nums[1];
        int newarr[]=new int[nums.length];
        newarr[0]=nums[0];
        for(int j=2;j<nums.length;j++){
            if(a>b){
                newarr[i]=nums[j];
                a=nums[j];
                i++;
            }
            else{
                b=nums[j];
            }
        }
        for(int k=0;k<nums.length;k++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[k]==newarr[j]){
                    count++;
                }
            }
            if(count==0){
                newarr[i]=nums[k];
                i++;
            }
        }
        return newarr;
    }
}