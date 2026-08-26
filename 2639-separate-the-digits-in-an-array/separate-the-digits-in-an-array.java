class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int a:nums){
            if(a>9){
                List<Integer> tempA=new ArrayList<>();
                int temp=a;
                while(temp>0){
                    tempA.add(temp%10);
                    temp=temp/10;
                }
                Collections.reverse(tempA);
                for(int b:tempA){
                    arr.add(b);
                }
            }
            else arr.add(a);
        }
        int[] ans=new int[arr.size()];
        int i=0;
        for(int a:arr){
            ans[i++]=a;
        }
        return ans;
    }
}