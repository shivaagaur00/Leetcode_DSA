class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        int[] count=new int[26];
        for(int i:s.toCharArray()){
            count[i-'a']++;
        }
        int even=0;
        List<Integer> arr=new ArrayList<>();
        for(int a:count){
        if(a%2!=0){
            arr.add(a);
        }
        else{
            even+=(a/2);
        }
        }
        if(arr.size()>k) return false;
        return true;
    }
}