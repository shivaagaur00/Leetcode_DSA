class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        if(a%2==0 && b%2==0)return 0;  
        int x=0;  
        if(a%2!=0){
            for(int i=0;i<b;i++){
                x^=nums2[i];
            }
        }
        if(b%2!=0){
            for(int i=0;i<a;i++){
                x^=nums1[i];
            }
        }
        return x;
    }
}