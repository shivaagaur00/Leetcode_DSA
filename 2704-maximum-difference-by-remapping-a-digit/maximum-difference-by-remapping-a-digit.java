class Solution {
    public int minMaxDifference(int num) {
        int max=num;
        int min=num;
        for(int i=0;i<=9;i++){
            int temp=num;
            int a=0;
            int id=0;
            while(temp!=0){
                int m=temp%10;
                if(m==i){
                    a=9*(int)Math.pow(10,id)+a;
                }
                else a=m*(int)Math.pow(10,id)+a;
                id++;
                temp/=10;
            }
            // System.out.println(a+" "+max);
            max=Math.max(max,a);
        }
        for(int i=0;i<=9;i++){
            int temp=num;
            int a=0;
            int id=0;
            while(temp!=0){
                int m=temp%10;
                if(m==i){
                    a=0*(int)Math.pow(10,id)+a;
                }
                else a=m*(int)Math.pow(10,id)+a;
                id++;
                temp/=10;
            }
            min=Math.min(min,a);
        }
        // System.out.println(max+" "+min);
        return max-min;
    }
}