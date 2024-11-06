class Solution {
    public boolean canSortArray(int[] nums) {
        List<pair> ls=new ArrayList<>();
        int bit[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            bit[i]=Integer.bitCount(nums[i]);
        }
        ls.add(new pair(nums[0],nums[0]));
        for(int i=1;i<nums.length;i++){
            if(bit[i]==bit[i-1]){
                pair temp=ls.get(ls.size()-1);
                temp.max=Math.max(temp.max,nums[i]);
                temp.min=Math.min(temp.min,nums[i]);
            }
            else{
                ls.add(new pair(nums[i],nums[i]));
            }
        }
        int min=Math.max(ls.get(0).min,ls.get(0).max);
        for(int i=1;i<ls.size();i++){
            if(min>ls.get(i).min || min>ls.get(i).max) return false; 
            min=Math.max(ls.get(i).max,min);         
        }
        return true;
    }
}
class pair{
    int max;
    int min;
    pair(int min,int max){
        this.min=min;
        this.max=max;
    }
}