class Solution {
    public int maxProduct(int[] nums) {
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        int max=temp[0];
        int product=1;
       for(int i=0;i<nums.length;i++){
        product=1;
        product*=nums[i];
        max=Math.max(max,product);
        for(int j=i+1;j<nums.length;j++){
         product*=nums[j];
         max=Math.max(product,max);   
        }
        
       }
       return max; 
    }
}