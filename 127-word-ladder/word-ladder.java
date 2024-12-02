class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<pair> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        for(String st:wordList){
            set.add(st);
        }
        int len=beginWord.length();
        set.remove(beginWord);
        q.add(new pair(beginWord,1));
        while(!q.isEmpty()){
            pair temp=q.poll();
            String s=temp.s;
            int step=temp.step;
            if(s.equals(endWord)) return step;
            for(int i=0;i<len;i++){
                for(char ch='a';ch<='z';ch++){
                    char arrRep[]=s.toCharArray();
                    arrRep[i]=ch;
                    String RepWord=new String(arrRep);
                    if(set.contains(RepWord)){
                        set.remove(RepWord);
                        q.add(new pair(RepWord,step+1));
                    }
                }
            }
        }
        return 0;
    }
}
class pair{
    String s;
    int step;
    pair(String s,int step){
        this.step=step;
        this.s=s;
    }
}