class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=potions.length;
        int ans[]=new int[spells.length];
        for(int i=0;i<ans.length;i++){
            int a=func(potions,spells[i],0,n-1,success);
            if(a<n){
                ans[i]=n-a;
            }
        }
        return ans;   
    }
    public int func(int[] arr,int a,int i,int j,long success){
        int index=arr.length;
        while(i<=j){
            int mid=i+(j-i)/2;
            long element=(long)arr[mid]*a;
            if(element>=success){
                index=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return index;
    }
}