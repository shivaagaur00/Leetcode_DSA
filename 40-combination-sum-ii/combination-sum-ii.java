class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        func(arr,list,0,0,target,candidates);
        return arr;
    }
    public void func(List<List<Integer>> arr,List<Integer> list,int i,int sum,int target,int[] candidates){
        if(sum==target){
            if(!arr.contains(list)) arr.add(new ArrayList<>(list));
            return;
        }
        if(sum>target) return;
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]) continue;
            // if(sum>target) break;
            list.add(candidates[j]);
            func(arr,list,j+1,sum+candidates[j],target,candidates);
            list.remove(list.size()-1);
        }
        return;
    }
}