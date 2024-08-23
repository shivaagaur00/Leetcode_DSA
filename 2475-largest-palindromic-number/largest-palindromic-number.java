class Solution {
    public String largestPalindromic(String num) {
        int[] arr=new int[10];
        String s="";
        List<Integer> list=new ArrayList<>();
        for(char c:num.toCharArray()){
            arr[Character.getNumericValue(c)]++;
        }
        int odd;
        for(int i=9;i>=0;i--){
            if(arr[i]%2!=0){
                odd=i;
                s+=odd;
                arr[odd]--;
                break;
            }
        }
        for(int i=0;i<10;i++){
            if(arr[i]%2!=0) arr[i]--;
            if(arr[i]>0){
                arr[i]/=2;
                while(arr[i]>0){
                s=i+s+i;
                arr[i]--;
                }
            }
        }
        while(s.length()>0 && s.charAt(0)=='0'){
            s=s.substring(1);
            if(s.length()>0) s=s.substring(0,s.length()-1);
        }
        if(s.length()==0) s="0";
       return s;
    }
}