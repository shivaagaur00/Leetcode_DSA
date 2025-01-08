class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()<=words[j].length()) {
                    System.out.println(words[i] + " " + words[j]);
                    if (isprefix(words[i], words[j])) {
                        count++;
                    }
                }
            }
        }
            return count;
    }
    public boolean isprefix(String s,String s2){
        int count=0;
        for(int i=0,j=s2.length()-s.length();i<s.length() ;i++,j++){
            if(s.charAt(i)==s2.charAt(i) && s.charAt(i)==s2.charAt(j)){
                count++;
            }
            else{
                count=0;
                break;
            }       
        }
        if(count!=0){
             return true;
        }
        else{
            return false;
        }
    }
}