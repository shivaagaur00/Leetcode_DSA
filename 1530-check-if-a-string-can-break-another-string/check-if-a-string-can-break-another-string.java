class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        return check(s1,s2)||check(s2,s1);
    }
    public boolean check(String s1,String s2){
        String[] arr1=s1.split("");
        String[] arr2=s2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<s1.length();i++){
            if(arr1[i].charAt(0)<arr2[i].charAt(0)) return false;
        }        
        return true;
    }
}