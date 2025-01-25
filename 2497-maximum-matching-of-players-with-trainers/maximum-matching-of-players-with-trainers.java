class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n=players.length;
        int j=n-1;
        int k=trainers.length;
        int i=k-1;
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