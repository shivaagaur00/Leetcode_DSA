class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        int n = s.length();
        List<Integer> answer = new ArrayList<>();
        Queue <Integer> q = new LinkedList<>();
        int temp=-1,lastb=-1;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c==b.charAt(0)&&i<=n-b.length()){
                if(s.regionMatches(i, b, 0, b.length())){
                    lastb=i;
                    for(int lasta:q){
                        if(lastb!=-1&&Math.abs(lasta-lastb)<=k && !answer.contains(lasta)){
                            answer.add(lasta);
                        }
                    }
                }
            }
            if(c == a.charAt(0) && i <= n - a.length()){
                if(s.regionMatches(i, a, 0, a.length())){
                    temp = i;
                    if(temp != -1 && lastb != -1 && Math.abs(temp - lastb) <= k){
                        answer.add(temp);
                    }
                    else{
                        q.add(temp);
                    }
                }
            }
        }
        return answer;
    }
}