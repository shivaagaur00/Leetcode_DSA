class Solution {
    public String largestPalindromic(String num) {
        int[] arr=new int[10];
        for(char c:num.toCharArray()){
            arr[Character.getNumericValue(c)]++;
        }
        int odd=10;
        for(int i=9;i>=0;i--){
            if(arr[i]%2!=0){
                odd=i;
                break;
            }
        }
        String s="";
        List<Integer> list=new ArrayList<>();
        if(odd<10){
            s+=odd;
            arr[odd]--;
        }
        for(int i=0;i<10;i++){
            if(arr[i]%2!=0) arr[i]--;
            if(arr[i]>0){
                list.add(i);
                arr[i]/=2;
            }
        }
        for(int a:list){
            while(arr[a]>0){
                s=a+s+a;
                arr[a]--;
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