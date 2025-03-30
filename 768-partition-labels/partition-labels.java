class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] count=new int[26];
        boolean[] check=new boolean[26];
        int curr=0;
        List<Integer> ans=new ArrayList<>();
        for(char c:s.toCharArray()) count[c-'a']++;
        for(char c:s.toCharArray()){
            check[c-'a']=true;
            count[c-'a']--;
            curr++;
            boolean cont=false;
            for(int i=0;i<26;i++){
                if(check[i] && count[i]!=0) cont=true; 
            }
            if(!cont){
                ans.add(curr);
                curr=0;
            }
        }
        return ans;
    }
}