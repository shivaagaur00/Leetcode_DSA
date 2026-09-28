class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            map.put(allowed.charAt(i),map.getOrDefault(allowed.charAt(i),0)+1);
        }
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> map1= new HashMap<>();
            for( int j=0;j<words[i].length();j++){
                map1.put(words[i].charAt(j),map.getOrDefault(words[i].charAt(j),0)+1);


            }
            boolean flag=true;
            for(char ch:map1.keySet()){
                if((!map.containsKey(ch))){
                    flag=false;
                }
                
            }
            if(flag){
                count++;
            }
        }
        return count;
        

        
    }
}