class Solution {
    public String arrangeWords(String text) {
        String []arr=text.split(" ");
        String[][] nums=new String[arr.length][2];
        for(int i=0;i<nums.length;i++){
            nums[i][0]=arr[i];
            nums[i][1]=""+arr[i].length();
        }
        Arrays.sort(nums, (a, b) -> Integer.parseInt(a[1]) - Integer.parseInt(b[1]));
        String ans="";
        for(String[] s:nums){
            ans+=s[0]+" ";
        }
        ans=ans.toLowerCase();
        ans=((ans.charAt(0)+"").toUpperCase())+ans.substring(1);
        return ans.trim();
    }
}