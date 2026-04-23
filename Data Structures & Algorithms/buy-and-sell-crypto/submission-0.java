class Solution {
    public int maxProfit(int[] prices) {
     int minprice = prices[0];
     int profit = 0;
     int maxprofit = 0;
     for(int c: prices){
        if(c<minprice){
            minprice = c;
        }else{
            profit = c - minprice;
            if(profit>maxprofit){
                maxprofit = profit;
            }
        }

     }
     return maxprofit;




    }
}
