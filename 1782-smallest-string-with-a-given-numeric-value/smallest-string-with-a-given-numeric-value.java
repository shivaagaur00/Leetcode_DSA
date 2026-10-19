class Solution {
    public String getSmallestString(int n, int k) {
        int count=k-n;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        for(int i=n-1;i>=0;i--){
            if(count>24){
                arr[i]=26;
                count-=25;
            }
            else{
                arr[i]+=count;
                count=0;
            }
        }
        Map<Integer,Character> map=new HashMap<>();
        char c='a';
        for(int i=1;i<=26;i++){
            map.put(i,c++);
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            ans.append(map.get(arr[i]));
        }
        return ans.toString();
    }
}