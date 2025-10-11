class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        func(ans,temp,nums,freq);
        return ans;
    }
    public void func(List<List<Integer>> ans,List<Integer> arr,int[] nums,boolean[] freq){
        int n=nums.length;
        if(arr.size()==n){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<n;i++){
            if(!freq[i]){
                arr.add(nums[i]);
                freq[i]=true;
                func(ans,arr,nums,freq);
                freq[i]=false;
                arr.remove(arr.size()-1);
            }
        }
    }
}