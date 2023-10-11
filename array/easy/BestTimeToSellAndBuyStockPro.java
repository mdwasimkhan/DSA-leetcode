package learn.dsa.array.easy;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Result :  5
 */
class BestTimeToSellAndBuyStockPro {
    public int maxProfit(int[] prices) {
    	int minPrice = prices[0];
        int maxBenefit=0;
        for(int i=0;i<prices.length;i++){
            maxBenefit = Math.max(maxBenefit, prices[i]-minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxBenefit;
    }
    
    public static void main(String[] args) {
    	int[] prices = {7,1,5,3,6,4};
		BestTimeToSellAndBuyStockPro object = new BestTimeToSellAndBuyStockPro();
		System.out.println("Result : "+object.maxProfit(prices));
	}
}