class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor=0;
        String[] st=new String[nums.length];
        int pow=(int)Math.pow(2,maximumBit);
        pow--;
        String p=Integer.toBinaryString(pow);
        String zero="";
        // System.out.println(p);
        for(int i=0;i<p.length();i++){
            zero+="0";
        }
        // System.out.println(zero);
        int idx=nums.length-1;
        for(int a:nums){
            xor^=a;
            // System.out.println(xor);
            if(xor!=0) st[idx]=Integer.toBinaryString(xor);
            else st[idx]="";
            // System.out.print(st[idx--]+" ");
            idx--;
        }
        // for(String s:st) System.out.print(s+" ");
        for(int i=0;i<nums.length;i++){
            String temp="";
            // for(int j=p.length()-1;j>=0;j--){
            //     if(j<st[i].length()){
            //         if(st[i].charAt(j)=='0') temp="1"+temp;
            //         else temp="0"+temp;
            //         if(i==2) System.out.println(temp);
            //         // temp=st[i].charAt(j)+temp;
            //     }
            //     else{
            //         temp+="1";
            //         // if(i==2) System.out.println(temp);
            //     }
            // }
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