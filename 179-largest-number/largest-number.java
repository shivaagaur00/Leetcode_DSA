class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=""+nums[i];
        }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        String ans="";
        if(arr[0].equals("0")) return "0";
        for(String s:arr){
            ans+=s;
        }
        return ans;
    }
}