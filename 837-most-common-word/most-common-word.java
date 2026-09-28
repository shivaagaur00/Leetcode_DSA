class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s=paragraph.toLowerCase();
        String st="";
        for(char c:s.toCharArray()){
            if((c<='z' && c>='a') || (c==' ')){
                st+=c;
            }else{
                st=st+' ';
            }
        }
        // System.out.println(st);
        String arr[]=st.split(" ");
        HashMap<String,Integer> map= new HashMap<>();
        Set<String> set=new HashSet<>();
        for(String sp:banned){
            set.add(sp);
        }
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]) || arr[i]==""){
                continue;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>();
        int max=0;
        for(String sta:map.keySet()){
            System.out.println(sta+" "+map.get(sta));
            max=Math.max(max,map.get(sta));
            
        }
        for(String ma:map.keySet()){
            if(map.get(ma)==max){
                return ma;
            }
        }
        return "";

    }
}