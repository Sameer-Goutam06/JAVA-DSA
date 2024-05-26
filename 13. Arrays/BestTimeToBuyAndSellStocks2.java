public class BestTimeToBuyAndSellStocks2 
{
    //Attempt 001:Leetcode Solution
    public static void main(String[] args)
    {
        int[] prices= {7,1,5,3,6,4};
        int totalProfit=0;
        for(int i=0;i<prices.length -1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                totalProfit+= -1 * (prices[i]-prices[i+1]);
            }
        }
        System.out.println(totalProfit);
    }
}
