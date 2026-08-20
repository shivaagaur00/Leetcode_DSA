class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        Set<Integer> st=new HashSet<>();
        int i=0;
        for(int a:nums){
            if(st.contains(a)) ans[i++]=a;
            else st.add(a);
        }
        return ans;
    }
}