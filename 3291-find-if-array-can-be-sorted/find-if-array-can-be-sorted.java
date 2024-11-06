class Solution {
    public boolean canSortArray(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        int bit[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            bit[i]=Integer.bitCount(nums[i]);
        }
        ls.add(new ArrayList<>());
        ls.get(0).add(nums[0]);
        System.out.println(ls);
        for(int i=1;i<nums.length;i++){
            if(bit[i]==bit[i-1]){
                ls.get(ls.size()-1).add(nums[i]);
            }
            else{
                ls.add(new ArrayList<>());
                ls.get(ls.size()-1).add(nums[i]);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(List<Integer> arr:ls){
            Collections.sort(arr);
            for(int a:arr){
                ans.add(a);
            }
        }
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)<ans.get(i-1)) return false;
        }
        return true;
    }
}