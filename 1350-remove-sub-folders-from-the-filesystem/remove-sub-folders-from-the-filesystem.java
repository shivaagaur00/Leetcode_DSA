class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder,(a,b)->{
            return a.length()-b.length();
        });
        int n=folder.length;
        boolean[] arr=new boolean[n];
        for(int i=0;i<n;i++){
            if(arr[i]) continue;
            for(int j=i+1;j<n;j++){
                if(arr[j]) continue;
                if(folder[i].length()==folder[j].length()){
                    if(folder[i].equals(folder[j])) arr[j]=true;
                }
                else if(folder[j].substring(0,folder[i].length()+1).equals(folder[i]+"/")){
                    // System.out.println(folder[j].substring(0,folder[i].length()+1)+" "+folder[i]+"/");
                    arr[j]=true;
                }
            }
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!arr[i]){
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}