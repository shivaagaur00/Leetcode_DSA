class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length%2!=0) return (long)-1;
        Arrays.sort(skill);
        int i=1;
        int j=skill.length-2;
        int a=skill[0]+skill[skill.length-1];
        long ans=(long)(skill[0]*skill[skill.length-1]);
        while(i<j){
            if(skill[i]+skill[j]!=a) return (long)-1;
            ans+=(long)(skill[i]*skill[j]);
            i++;
            j--;
        }
        return ans;
    }
}