class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j=players.length-1;
        int i=trainers.length-1;
        int ans=0;
        while(j>=0 && i>=0){
            while(j>=0 && players[j]>trainers[i]){
                j--;
            }
            if(i>=0 && j>=0) ans++;
            i--;
            j--;
        }
        return ans;
    }
}