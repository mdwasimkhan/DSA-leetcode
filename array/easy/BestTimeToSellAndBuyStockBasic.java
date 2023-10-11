package learn.dsa.array.easy;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Result :  * Time Limit Exceeded 200/212 testcases passed
 */
class BestTimeToSellAndBuyStockBasic {
    public int maxProfit(int[] prices) {
        int maxBenefit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    if(maxBenefit<prices[j]-prices[i]){
                        maxBenefit=prices[j]-prices[i]; 
                    }   
                }
            }
        }
        return maxBenefit;
    }
    
    public static void main(String[] args) {
    	int[] prices = {7,1,5,3,6,4};
		BestTimeToSellAndBuyStockBasic object = new BestTimeToSellAndBuyStockBasic();
		System.out.println("Result : "+object.maxProfit(prices));
	}
}