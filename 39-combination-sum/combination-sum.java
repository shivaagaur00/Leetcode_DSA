class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        func(arr,list,0,0,target,candidates);
        return arr;
    }
    public void func(List<List<Integer>> arr,List<Integer> list,int i,int sum,int target,int[] candidates){
        if(sum==target){
            arr.add(new ArrayList<>(list));
            return;
        }
        if(sum>target) return;
        for(int j=i;j<candidates.length;j++){
            list.add(candidates[j]);
            func(arr,list,j,sum+candidates[j],target,candidates);
            list.remove(list.size()-1);
        }
        return;
    }
}