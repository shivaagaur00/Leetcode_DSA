class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area=0;
        double di=0;
        for(int[] arr:dimensions){
            if(di<(Math.sqrt(arr[0]*arr[0]+arr[1]*arr[1]))){
                area=arr[0]*arr[1];
                di=(Math.sqrt(arr[0]*arr[0]+arr[1]*arr[1]));
            }
            else if(di==(Math.sqrt(arr[0]*arr[0]+arr[1]*arr[1])) && area<(arr[0]*arr[1])){
                area=arr[0]*arr[1];
                di=(Math.sqrt(arr[0]*arr[0]+arr[1]*arr[1]));
            }
            // System.out.println(area+" "+di);
        }
        return area;
    }
}