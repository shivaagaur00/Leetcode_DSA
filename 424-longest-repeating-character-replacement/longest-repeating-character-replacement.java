class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> set=new HashSet<>();
        char arr[]=s.toCharArray();
        for(char c:arr){
            set.add(c);
        }
        int max=0;
        int n=s.length();
        if(set.size()==1) return n;
        for(char c:set){
            int temp=func(c,arr,k);
            max=Math.max(max,temp);
        }
        return max;
    }
    public int func(char c,char []arr,int k){
        int zero=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=c) zero++;
        }
        if(zero<k) return n;
        else if(k==0){
            int con=0;
            for(int i=0;i<n;i++){
                if(arr[i]==c){
                    int max=0;
                    while(i<n && arr[i]==c){
                        max++;
                        i++;
                    }
                    con=Math.max(con,max);
                }
            }
        return con;
        }
        else{
            List<Integer> ls=new ArrayList<>();
            int res=0;
            int temp=k;
            int id=0;
            while(id<n && temp>=0){
                if(temp==0 && arr[id]!=c) break;
                if(arr[id]!=c){
                    ls.add(id);
                    temp--;
                }
                id++;
            }
            // id--;
            res=id;
            // System.out.println(res);
            int prev=ls.get(0);
            for(;id<n;id++){
                if(arr[id]!=c){
                    prev=ls.get(0)+1;
                    res=Math.max(res,id-prev+1);
                    ls.remove(0);
                    ls.add(id);
                }
                else{
                    res=Math.max(res,id-prev+1);
                }
            }
            // System.out.println(c+" "+res);
            return res;
        }
    }
}