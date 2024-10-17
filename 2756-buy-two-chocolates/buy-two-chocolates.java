class Solution {
    public int buyChoco(int[] arr, int money) {
     int ans=0;
     Arrays.sort(arr);
     if(arr[0]+arr[1]<=money) return money-(arr[0]+arr[1]);
     return money;
    }
}