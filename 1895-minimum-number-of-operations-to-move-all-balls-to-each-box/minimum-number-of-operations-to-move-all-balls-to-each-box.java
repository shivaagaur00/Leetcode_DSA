class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        char[] num=boxes.toCharArray();
        for(int i=0;i<boxes.length();i++){
            int count=0;
            for(int j=0;j<boxes.length();j++){
                if(num[j]=='1'){
                    count+=(Math.abs(i-j));
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}