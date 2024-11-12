class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items,(a,b)->{
            return a[0]-b[0];
        });
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        int max=0;
        for(int i=0;i<items.length;i++){
            max=Math.max(items[i][1],max);
            map.put(i,max);
            map2.put(items[i][0],i);
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(map2.containsKey(queries[i])) ans[i]=map.get(map2.get(queries[i]));
            else if(queries[i]>items[items.length-1][0]) ans[i]=max;
            else{
            int b=func(queries[i],items);
            ans[i]=map.getOrDefault(b,0);
            }
        }
        return ans;
    }
    public int func(int a,int[][] items){
        int i=0;
        int j=items.length-1;
        int res=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(items[mid][0]<=a){
                i=mid+1;
                res=mid;
            }
            else{
                j=mid-1;
            }
        }
        return res;   
    }
}