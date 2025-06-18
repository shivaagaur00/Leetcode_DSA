class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans=new int[nums.length/3][3];
        int id=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<3;j++){
                ans[i][j]=nums[id++];
            }
            if((ans[i][2]-ans[i][0])>k) return new int[0][0];
        }
        // Lisr<int[]> arr=new ArrayList<>();

        // boolean falg=true;
        // int prev=nums[0];
        // int[] temp=new int[3];
        // temp[0]=nums[0];
        // int j=1;
        // for(int i=1;i<nums.length-2;i++){
        //     if((nums[i]-temp[0])>k){
        //         flag=false;
        //         break;
        //     }
        //     temp[j++]=nums[i];
        //     if(j==3){
        //         arr.add(temp);
        //         temp[0]=0;
        //         temp[1]=0;
        //         temp[2]=0;
        //         if(i+1<n) temp[0]=nums[i+1];
        //     }
        // }
        // System.out.println(arr);
        // int[][] ans=new ArrayList<>();
        return ans;
    }
}