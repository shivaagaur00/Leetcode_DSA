class Solution {
    public int maximumLength(String s) {
        String[] arr=s.split("");
        Map<String,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            StringBuilder temp=new StringBuilder("");
            for(int j=i;j<n;j++){
                if(s.charAt(j)==ch){
                temp.append(arr[j]);
                String str=temp.toString();
                map.put(str,map.getOrDefault(str,0)+1);
                }
                else break;
            }
        }
        int max=-1;
        for(String st:map.keySet()){
            if(map.get(st)>=3) max=Math.max(max,st.length());
        }
        return max;
    }
}