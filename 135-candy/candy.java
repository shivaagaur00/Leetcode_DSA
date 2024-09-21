class Solution {
    public int candy(int[] ratings) {
        int ans=0;
        int[] left=new int[ratings.length];
        int[] right=new int[ratings.length];
        left[0]=1;
        int curr=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]) left[i]=++curr;
            else{
                curr=1;
                left[i]=1;
            }
        }
        curr=1;
        right[ratings.length-1]=1;
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) right[i]=++curr;
            else{
                curr=1;
                right[i]=1;;
            }
        }
        for(int i=0;i<ratings.length;i++){
            ans+=(Math.max(left[i],right[i]));
        }
        return ans;
    }
}