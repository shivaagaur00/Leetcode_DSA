class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min=Integer.MAX_VALUE;
        int n=s.length();
        int j=0;
        List<String> arr=new ArrayList<>();
        int count=0;
        for(int i=0;i<=n-k;i++){
            if(s.charAt(i)=='1'){
                for(;j<n;j++){
                    if(s.charAt(j)=='1') count++;
                    if(count==k){
                        arr.add(s.substring(i,j+1));
                        min=Math.min(min,j-i+1);
                        j++;
                        break;
                    }
                }
                count--;
            }
        }
        Collections.sort(arr);

        // System.out.println(min);
        
        // System.out.println(arr);
        if(arr.size()==0) return "";
        for(String st:arr){
            if(st.length()==min) return st;
        }
        return "";
    }
}