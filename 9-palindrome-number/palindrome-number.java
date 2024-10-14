class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int new_element=0;
        while(y>0){
            int k=y%10;
            y=y/10;
            new_element=new_element*10+k;   
        }
        if(x==new_element){
            return true;
        }
        else{
            return false;
        }        
    }
}