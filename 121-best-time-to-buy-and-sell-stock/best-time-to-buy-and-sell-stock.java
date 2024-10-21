class Solution {
    public int maxProfit(int[] prices) {
      int max=0;
      int minprice=Integer.MAX_VALUE;
      for(int i=0;i<prices.length;i++){
        minprice=Math.min(minprice,prices[i]);
        max=Math.max(prices[i]-minprice,max);
      }  
      return max;
    }
}