class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int a:nums){
            ls.add(a);
        }
        int k=nums.length;
        while(k-->1){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<ls.size()-1;i++){
                temp.add((ls.get(i)+ls.get(i+1))%10);
            }
            ls=new ArrayList<>(temp);
            
        // System.out.println(ls);
        }
        // return 0;
        return ls.get(0);
    }
}