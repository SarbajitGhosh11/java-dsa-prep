import java.util.*;

public class BuynSellStocks {

    public static int solve (int prices[]) {
        int buyingPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
           if (buyingPrice < prices[i] ) {
            profit = prices[i] - buyingPrice;
            maxProfit = Math.max(maxProfit, profit);
           } else {
            profit = 0;
            buyingPrice = prices[i];
           }
        }

        return maxProfit;

    //     int mini = prices[0], profit = 0;

    //     for(int stock : prices){
            
    //         profit = Math.max(stock-mini,profit);

    //         mini = Math.min(stock,mini);
    //     }

        
    }
    
}


public static void main(String args[]) {
    int prices[] = {7, 1, 5, 3, 6, 4};
    System.out.println("Ans: "+ BuynSellStocks.solve(prices));
}

                                                  