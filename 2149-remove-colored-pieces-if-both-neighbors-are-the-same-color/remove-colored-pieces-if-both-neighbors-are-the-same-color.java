class Solution {
    public boolean winnerOfGame(String colors) {
        List<Integer> alice=new ArrayList<>();
        List<Integer> bob=new ArrayList<>();
        int count=0;
        int count1=0;
        int max_bob=0;
        int max_alice=0;
        for(char c:colors.toCharArray()){
            if(c!='B')count++;
            else{
                max_alice=Math.max(max_alice,count);
                if(count>=3) alice.add(count);
                count=0;
            }
        }
        if(count>=3) alice.add(count);
        max_alice=Math.max(max_alice,count);
        count=0;
        for(char c:colors.toCharArray()){
            if(c=='B')count++;
            else{
                max_bob=Math.max(max_bob,count);
                if(count>=3) bob.add(count);
                count=0;
            }
        }
        if(count>=3) bob.add(count);
        max_bob=Math.max(max_bob,count);
        int aliceno=0;
        for(int a:alice){
            aliceno+=(a-2);
        }
        int bobno=0;
        for(int b:bob){
            bobno+=(b-2);
        }
        System.out.println(aliceno+" "+bobno);
        return aliceno>bobno;
    }
}