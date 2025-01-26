class Solution {
    public List<Integer> filterRestaurants(int[][] arr, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(maxPrice<arr[i][3] || maxDistance<arr[i][4] || (veganFriendly==1 && arr[i][2]!=1)){
                arr[i][0]=0;
            }
        }
        Arrays.sort(arr, (a, b) -> {
    if (a[1] != b[1]) {
        return b[1] - a[1];
    } else {
        return b[0] - a[0];
        }
    });

    for(int[] ar:arr){
        System.out.println(ar[0]);
        if(ar[0]>0){
            ans.add(ar[0]);
        }
        // else break;
    }
    return ans;
    }
}