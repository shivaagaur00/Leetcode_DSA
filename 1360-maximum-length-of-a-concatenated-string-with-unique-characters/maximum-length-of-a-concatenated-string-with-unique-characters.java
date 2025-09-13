class Solution {
    public int maxLength(List<String> arr) {
        return func(0,arr.size(),arr,0,new int[26]);
    }
    public int func(int i,int n,List<String> arr,int max,int[] ct){
        if(i>n){
            return 0;
        }
        if(i==n){
            return max;
        }
        boolean check=true;
        int[] ctTemp=Arrays.copyOf(ct,26);
        for(char c:arr.get(i).toCharArray()){
            if(ctTemp[c-'a']>0){
                check=false;
                break;
            }
            ctTemp[c-'a']++;
        }
        int pick=0;
        if(check) pick=func(i+1,n,arr,max+arr.get(i).length(),ctTemp);
        int notPick=func(i+1,n,arr,max,ct);
        return Math.max(pick,notPick);
    }
}