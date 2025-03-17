class Solution {
    String[] digitString = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] teenString = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};
    String[] tenString = new String[]{"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        String ans=func("",""+num);
        if(ans=="") return "Zero";
        return ans;
    }
    public String func(String ans,String curr){
        int n=curr.length();
        if(n==0) return ans;
        while(curr.length()>0 && curr.charAt(0)=='0') curr=curr.substring(1);
        n=curr.length();
        if(n==10){
            ans=ans+digitString[Character.getNumericValue(curr.charAt(0))]+" Billion";
            ans=ans+" "+func("",curr.substring(1));
        }
        else if(n>=7){
            ans+=" "+func("",curr.substring(0,curr.length()%6))+" Million";
            ans=ans+" "+func("",curr.substring(curr.length()%6));
        }
        else if(n>=4){
            if(n==6){
                ans=ans+" "+func("",curr.substring(0,3))+" Thousand";
                ans=ans+" "+func("",curr.substring(3));
            }
            else{
                ans+=" "+func("",curr.substring(0,curr.length()%3))+" Thousand";
                ans=func(ans,curr.substring(curr.length()%3));
            }
        }
        else if(curr.length()==3){
            ans+=" "+digitString[Character.getNumericValue(curr.charAt(0))]+" Hundred";
            ans=func(ans,curr.substring(1));
        }
         else if(curr.length()==2){
            if(Character.getNumericValue(curr.charAt(0))>1){
                ans+=" "+tenString[Character.getNumericValue(curr.charAt(0))];
                if(curr.charAt(1)!='0'){
                    ans+=" "+digitString[Character.getNumericValue(curr.charAt(1))];
                }
            }
            else{
                ans+=" "+teenString[Character.getNumericValue(curr.charAt(1))];
            }
        }
         else if(curr.length()==1){
            ans+=" "+digitString[Character.getNumericValue(curr.charAt(0))];
        }
        return ans.trim();

    }
}