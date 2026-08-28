class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> arr=new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=nums3.length;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        for(int num:nums3){
            set3.add(num);
        }
        for(int i=0;i<n2;i++){
            if(set1.contains(nums2[i])){
                arr.add(nums2[i]);
            }
        }
        for(int i=0;i<n1;i++){
            if(set3.contains(nums1[i])){
                arr.add(nums1[i]);
            }
        }
        for(int i=0;i<n3;i++){
            if(set2.contains(nums3[i])){
                arr.add(nums3[i]);
            }
        }
        return new ArrayList<>(arr);
    }
}