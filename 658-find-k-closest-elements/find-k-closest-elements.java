class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[][] temp=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            temp[i][0]=arr[i];
            temp[i][1]=Math.abs(arr[i]-x);
            
        }
        Arrays.sort(temp,(a,b)->a[1]-b[1]);
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<k;i++){
            ls.add(temp[i][0]);
        }
        Collections.sort(ls);
        return ls;
    }
}