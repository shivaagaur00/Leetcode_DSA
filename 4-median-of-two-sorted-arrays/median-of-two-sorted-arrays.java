class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            merge[i]=nums1[i];
        }
        for(int j=nums1.length,x=0;x<nums2.length && j<merge.length;x++,j++){
            merge[j]=nums2[x];
        }
        Arrays.sort(merge);
        if(merge.length%2!=0){
            double a=merge[(merge.length-1)/2];
            return a;
        }
        else{
            int j=merge.length-1;
            int i=0;
            while(j-i!=1){
                j--;
                i++;
            }
            double y=(double)(merge[i]+merge[j])/2;
            return y;
        }
    
    }
}