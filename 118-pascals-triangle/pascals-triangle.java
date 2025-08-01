class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<i+1;j++){
                ans.get(i).add(1);
            }
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                ans.get(i).set(j,ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
        }
        return ans;
    }
}