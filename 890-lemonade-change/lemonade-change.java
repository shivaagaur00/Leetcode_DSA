class Solution {
    public boolean lemonadeChange(int[] bills) {
     int five=0;
     int ten=0;
     int twenty=0;
     for(int a:bills){
        if(a==20){
            if(five>0 && ten>0){
                five--;
                ten--;
            }
            else if(five>2) five-=3;
            else return false;
        }
        else if(a==10){
            if(five>0){
                five--;
            }
            else return false;
            ten++;
        }
        else{
            five++;
        }
     }  
     return true; 
    }
}