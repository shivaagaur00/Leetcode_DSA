class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
        int n1=words1.length;
        int n2=words2.length;
        int arr[]=new int[26];
        for(int j=0;j<n2;j++){
            int temp[]=new int[26];
            for(char c:words2[j].toCharArray()){
                temp[c-'a']++;
            }
            for(int i=0;i<26;i++){
                arr[i]=Math.max(arr[i],temp[i]);
            }
        }
        for(int j=0;j<n1;j++){
            int temp[]=new int[26];
            for(char c:words1[j].toCharArray()){
                temp[c-'a']++;
            }
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(temp[i]<arr[i]){
                    flag=false;
                }
            }
            if(flag) ans.add(words1[j]);
        }
        return ans;
    }
}