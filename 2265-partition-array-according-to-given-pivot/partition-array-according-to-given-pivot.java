class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
    List<Integer> start=new ArrayList<>();
    List<Integer> end=new ArrayList<>();
    int p=0;
    for(int a:nums){
        if(pivot>a){
            start.add(a);
        }
        else if(pivot<a){
            end.add(a);
        }
        if(a==pivot) p++;
    }
    int[] ans=new int[nums.length];
    int i=0;
    for(;i<start.size();i++){
        ans[i]=start.get(i);
    }
    while(p-->0){
        ans[i++]=pivot;
    }
    for(int j=0;j<end.size();j++){
        ans[i++]=end.get(j);
    }
    return ans;
    }
}