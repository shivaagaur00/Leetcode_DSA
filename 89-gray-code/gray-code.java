class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int tot=(int)Math.pow(2,n);  
        for (int i=0;i<tot;i++) {
            result.add(i^(i>>1));
        }
        return result;
    }
}