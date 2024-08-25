class Solution {
    public int minDeletions(String s) {
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        List<Integer> list=new ArrayList<>();
        int ans=0;
        for(int a:arr){
            while(a>0 && list.contains(a)){
                a--;
                ans++;
            }
            if(a>0) list.add(a);
        }
        return ans;
    }
}