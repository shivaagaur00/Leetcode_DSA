class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr=new ArrayList<>();
        func(n,0,arr);
        return arr;
    }
    public void func(int n,int curr,List<Integer> arr){
        if(curr>n) return;
        int i=0;
        if(curr==0) i=1;
        else arr.add(curr);
        for(;i<=9;i++){
            func(n,curr*10+i,arr);
        }
    }
}