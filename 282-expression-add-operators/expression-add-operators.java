class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> list=new ArrayList<>();
        if (num == null || num.length() == 0) return list;
        func(list,num,target,0,"",0,0);
        return list;
    }
    public void func(List<String> list,String arr,int target,long sum,String s,long prev,int idx){
        if(idx==arr.length()){
            if(sum==target) list.add(s);
            return;
        }
        for(int i=idx;i<arr.length();i++){
            if (i>idx && arr.charAt(idx)=='0') break;
            long curr=Long.parseLong(arr.substring(idx,i+1));
        if(idx==0){
            func(list,arr,target,curr,s+curr,curr,i+1);
        }
        else{
        func(list,arr,target,sum+curr,s+"+"+curr,curr,i+1);
        func(list,arr,target,sum-curr,s+"-"+curr,-curr,i+1);
        func(list,arr,target,sum-prev+(prev*curr),s+"*"+curr,prev*curr,i+1);
        }
        }
    }    
}