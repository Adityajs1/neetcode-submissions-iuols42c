class Solution {
    public int maxProfit(int[] prices) {
        int minPri = Integer.MAX_VALUE;
        int max = 0;

        for(int price : prices){
            if(price < minPri){
                minPri = price;
            }
            else{
                int profit = price-minPri;
                max = Math.max(profit, max);
            }
        }
        return max;
    }
}
