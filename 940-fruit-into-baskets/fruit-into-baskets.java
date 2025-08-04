class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int i=0,j=0;
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(j<=i && i<n){
            if(map.size()==2 && map.getOrDefault(fruits[i],0)==0){
                int a=fruits[j];
                while(map.getOrDefault(a,0)>0){
                    map.put(fruits[j],map.get(fruits[j])-1);
                    if(map.get(fruits[j])==0){
                        map.remove(fruits[j]);
                        j++;
                        break;
                    }
                    j++;
                }
            }
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            ans=Math.max(ans,i-j+1);
            // System.out.println(i+" "+j);
            i++;
        }
        return ans;
    }
}