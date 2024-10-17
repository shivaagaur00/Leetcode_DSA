class Solution {
    public int buyChoco(int[] arr, int money) {
     int ans=0;
     int[] one=new int[2];
     int [] two=new int[2];
     one[0]=Integer.MAX_VALUE;
     two[0]=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++) {
        if(one[0]>arr[i]){
            one[1]=i;
            one[0]=arr[i];
        }
     }
     for(int i=0;i<arr.length;i++) {
        if(i!=one[1] && two[0]>arr[i] ){
            two[1]=i;
            two[0]=arr[i];
        }
     }
     if((one[0]+two[0])<=money) return money-(one[0]+two[0]);
     return money;
    }
}