class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor=0;
        String[] st=new String[nums.length];
        int pow=((int)Math.pow(2,maximumBit));
        pow--;
        String p=Integer.toBinaryString(pow);
        int idx=nums.length-1;
        for(int a:nums){
            xor^=a;
            if(xor!=0) st[idx]=Integer.toBinaryString(xor);
            else st[idx]="";
            idx--;
        }
        for(int i=0;i<nums.length;i++){
            String temp="";
            for(int j=0;j<p.length();j++){
                if(j<st[i].length()){
                    if(st[i].charAt(j)=='0') temp=temp+"1";
                    else temp=temp+"0";
                }else{
                    temp="1"+temp;
                }
            }
            nums[i]=Integer.parseInt(temp,2);
        }
        return nums;
    }
}