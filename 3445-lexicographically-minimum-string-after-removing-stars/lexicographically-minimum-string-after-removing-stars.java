class Solution {
    public String clearStars(String s) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                if(a[0]!=b[0]) return a[0]-b[0];
                else return b[1]-a[1];
            }
        });
        int i=0;
        int n=s.length();
        List<Integer> ls=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c!='*'){
                pq.add(new int[]{c-'a',i});
            }
            else{
                int[] temp=pq.poll();
                ls.add(temp[1]);
            }
            i++;
        }
        StringBuilder st=new StringBuilder();
        i=0;
        Collections.sort(ls);
        int j=0;
        // if(ls.isEmpty()) ls.add(-1);
        while(i<n){
            if(j<ls.size() && i==ls.get(j)){
                j++;
            }
            else{
                if(s.charAt(i)!='*') st.append(s.charAt(i));
            }
            i++;
        }
    return st.toString();

    }
}