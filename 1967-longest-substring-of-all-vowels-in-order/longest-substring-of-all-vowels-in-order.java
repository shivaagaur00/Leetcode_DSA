class Solution {
    public int longestBeautifulSubstring(String word) {
      char prev='a';
      int max=0;
      int n=word.length();
      int i=0;
      while(i<n){
        boolean[] flag=new boolean[5];
        prev='a';
        while(i<n && word.charAt(i)!=prev){
            i++;
        }
        if(i>=n) return max;
        int curr=0;
        while(i<n && word.charAt(i)==prev){
            i++;
            flag[0]=true;
            curr++;
        }
        if(i>=n) return max;
        prev='e';
        while(i<n && word.charAt(i)==prev){
            i++;
            flag[1]=true;
            curr++;
        }
        if(i>=n) return max;
        prev='i';
        while(i<n && word.charAt(i)==prev){
            i++;
            flag[2]=true;
            curr++;
        }
        if(i>=n) return max;
        prev='o';
        while(i<n && word.charAt(i)==prev){
            i++;
            flag[3]=true;
            curr++;
        }
        if(i>=n) return max;
        prev='u';
        while(i<n && word.charAt(i)==prev){
            i++;
            flag[4]=true;
            curr++;
        }
        int count=0;
        for(boolean a:flag){
            if(a) count++;
        }
        if(count==5) max=Math.max(max,curr);
      }  
      return max;
    }
}