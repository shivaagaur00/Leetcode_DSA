class Solution {
    public int longestCommonPrefix(int[] arr, int[] nums) {
        Map<String,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            String prefix="";
            String s=""+arr[i];
            for(char ch:s.toCharArray()){
                prefix+=ch;
                map.put(prefix,map.getOrDefault(prefix,0)+1);
            }
        }
        Set<String> set=new HashSet<>();
        for(int a:nums){
            String prefix="";
            String s=""+a;
            boolean flag=true;
            for(char ch:s.toCharArray()){
                prefix+=ch;
                if(map.containsKey(prefix)) ans=Math.max(ans,prefix.length());
            }
        }
        return ans;
    }
}