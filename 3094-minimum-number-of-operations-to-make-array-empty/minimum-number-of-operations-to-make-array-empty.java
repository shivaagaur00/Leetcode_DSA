class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }   
        int ans=0;
        for(int a:map.keySet()){
            int ct=map.get(a);
            if(ct==1){
                return -1;
            }
            else if(ct==2 || ct==4){
                ans+=ct/2;
            }
            else if(ct%3==0){
                ans+=ct/3;
            }
            else{
                    int temp=ct-2;
                    ans+=temp/3;
                    if(temp%3!=0){
                        ans+=1;
                    }
                    ans+=+1;
            }
        }
        return ans;
    }
}