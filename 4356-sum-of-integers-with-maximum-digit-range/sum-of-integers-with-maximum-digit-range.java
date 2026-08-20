class Solution {
    public int maxDigitRange(int[] nums) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            int k=func(a);
            map.put(a,k);
            max=Math.max(max,k);
            // System.out.println(k+" "+a);
        }
        for(int a:nums){
            if(max==map.get(a)){
                ans+=a;
            }
        }
        return ans;

    }
    public int func(int a){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(a>0){
            int n=a%10;
            a/=10;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        return max-min;
    }
}