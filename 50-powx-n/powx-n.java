class Solution {
    public double myPow(double x, int n) {
        long no=n;
        double answer=1.0;
        if(no<0){
            no=-1*no;
        }
        while(no>0){
            if(no%2==0){
                x=x*x;
                no/=2;
            }
            else{
                answer=x*answer;
                no=no-1;
            }
        }
        if(n<0){
            answer=1.0/answer;
        }
        return answer;
    }
}