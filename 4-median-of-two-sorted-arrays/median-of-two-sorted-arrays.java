class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=merge(nums1,nums2);
        if(arr.length%2!=0) return (double)arr[arr.length/2];
        return (double)(arr[arr.length/2]+arr[arr.length/2-1])/2;
    }
    public int[] merge(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int ans[]=new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[k++]=arr2[j++];
        }
        return ans;
    }
}