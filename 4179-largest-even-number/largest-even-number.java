class Solution {
    public String largestEven(String s) {
        String st="";
        boolean flag=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2') flag=true;
            if(flag) st=s.charAt(i)+st;
        }
        return st;

    }
}