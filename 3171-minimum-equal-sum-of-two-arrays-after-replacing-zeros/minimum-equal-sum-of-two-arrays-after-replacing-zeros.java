class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long ans=0;
        long countA=0;
        long countB=0;
        int zeroA=0;
        int zeroB=0;
        for(int a:nums1){
            countA+=a;
            if(a==0){
                zeroA++;
            }
        }
        for(int a:nums2){
            countB+=a;
            if(a==0){
                zeroB++;
            }
        }
        if(zeroA==0){
            if((countB+zeroB)>countA) return -1;
        }
        else if(zeroB==0){
            if((countA+zeroA)>countB) return -1;
        }
        if(zeroA==0 && zeroB==0 && countA!=countB) return -1 ;
        // System.out.println(countA+" "+countB);
        return Math.max(countA+zeroA,countB+zeroB);

    }
}