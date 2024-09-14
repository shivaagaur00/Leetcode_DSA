class Solution {
    public int minCost(String colors, int[] neededTime) {
        List<Integer> arr=new ArrayList<>();
        char prev=colors.charAt(0);
        int ans=0;
        for(int i=0;i<colors.length();i++){
            if(colors.charAt(i)!=prev && arr.size()>1){
                Collections.sort(arr);
                for(int j=0;j<arr.size()-1;j++) ans+=arr.get(j);
                arr.clear();
                arr.add(neededTime[i]);
                prev=colors.charAt(i);
            }
            else if(colors.charAt(i)!=prev && arr.size()==1){
                arr.clear();
                arr.add(neededTime[i]);
                prev=colors.charAt(i);
            }
            else{
                arr.add(neededTime[i]);
            }
        }
        if(arr.size()>1){
        Collections.sort(arr);
        for(int j=0;j<arr.size()-1;j++) ans+=arr.get(j);
        }
        return ans;
    }
}