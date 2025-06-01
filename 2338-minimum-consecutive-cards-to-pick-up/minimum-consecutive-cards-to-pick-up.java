class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=cards.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(map.containsKey(cards[i])){
                min=Math.min(min,i-map.get(cards[i])+1);
            }
            map.put(cards[i],i);
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}