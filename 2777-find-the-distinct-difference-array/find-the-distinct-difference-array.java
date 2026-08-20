class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Map<Integer,Integer> pref=new HashMap<>();
        Map<Integer,Integer> suff=new HashMap<>();
        for(int a:nums) suff.put(a,suff.getOrDefault(a,0)+1);
        int i=0;
        int ans[]=new int[nums.length];
        for(int a:nums){
            pref.put(a,pref.getOrDefault(a,0)+1);
            suff.put(a,suff.getOrDefault(a,0)-1);
            if(suff.get(a)==0) suff.remove(a);
            // System.out.println(pref.size()+" "+suff.size());
            ans[i++]=pref.size()-suff.size();       
        }
        return ans;
    }
}