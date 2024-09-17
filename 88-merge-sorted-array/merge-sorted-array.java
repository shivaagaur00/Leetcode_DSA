class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0;i<m+n;i++){
            while(nums1[i]==0 && j<n ){
//                System.out.println(0);
                if (nums2[j]!=0){
                    nums1[i]=nums2[j];
                    nums2[j]=0;
                    j++;
                }
                else{
                    j++;
                }
            }
        }
        for (int i=0;i<m+n;i++){
            j=i;
            while(j>0 && nums1[j]<nums1[j-1]){
                int temp=nums1[j];
                nums1[j]=nums1[j-1];
                nums1[j-1]=temp;
                j--;
            }
        }
        for (int i=0;i<m+n;i++){
            System.out.println(nums1[i]);
        }
    }
    }