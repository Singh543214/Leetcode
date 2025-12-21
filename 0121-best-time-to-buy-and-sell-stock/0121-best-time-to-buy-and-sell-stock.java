class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for(int ele: prices){
            buy=Math.min(buy,ele);
            sell=Math.max(sell,ele-buy);
        }
        return sell;
    }
}