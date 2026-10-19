class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int temp[]=arr.clone();
        int ans[]=new int[arr.length];
        if(arr.length==0) return ans;
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int m=temp[0];
        int rank=1;
        for(int i=0;i<temp.length;i++){
            if(m!=temp[i]) {
                m=temp[i];
                rank++;
            }
                
            map.put(temp[i],rank);
        }
       for(int i=0;i<arr.length;i++){
        ans[i]=map.get(arr[i]);
       }
       return ans;

        
    }
}