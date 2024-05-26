public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        // Attempt 001: 
        //to find the min value of array and max value after it
        // but we failed in a case that we need to increase the profit instead of using min and max
        // int[] min={0,prices[0]};
        // int[] max={0,prices[0]};
        // for(int i=0;i<prices.length;i++)
        // {
        //     if (min[1]>prices[i])
        //     {
        //         min[1]=prices[i];
        //         min[0]=i;
        //     }
        //     if ((max[1] < prices[i]) && (i > min[0]))
        //     {
        //         max[1]=prices[i];
        //         max[0]=i;
        //     }
        // }
        // System.out.println((max[1]-min[1]));
        
        //Attempt 002:
        // Leetcode and AI solution
        // we only need to calculate a maxProfit by using a min value which isnt actually minimum of an array
        // the min value is not actually the minvalue of an array it is optimised to get the maxprofit
        // it is checked with every element in loop and if it is not minimum the minimum changes
        // if it is minimum till then the maxprofit is calculated using max(maxProfit,min-prices[i])
        int maxProfit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else if(prices[i]-min>maxProfit)
            {
                maxProfit=prices[i]-min;
            }
        }
        System.out.println(maxProfit);
    }
}
