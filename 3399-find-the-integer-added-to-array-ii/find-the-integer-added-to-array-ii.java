class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int curr=0;
                int run=Integer.MIN_VALUE;
                int ct=0;
                int curr2=0;
                while(curr<n){
                    if(curr==i || curr==j){
                        curr++;
                        continue;
                    }
                    else{
                        if(run==Integer.MIN_VALUE){
                            run=nums2[curr2]-nums1[curr];
                        }
                        else if(run!=(nums2[curr2]-nums1[curr])) break;
                        curr2++;
                    }
                    curr++;
                    ct++;
                }
                if(ct==m){
                    return run;
                }
            }
        }
        return -1;
    }
}