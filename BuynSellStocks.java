import java.util.*;

public class BuynSellStocks {

    public static int solve (int prices[]) {
        // int buyingPrice = Integer.MAX_VALUE;
        // int profit = 0;
        // int maxProfit = 0;

        // for(int i=0; i<prices.length; i++) {
        //    if (buyingPrice < prices[i] ) {
        //     profit = prices[i] - buyingPrice;
        //    } else {
        //     profit = 0;
        //     buyingPrice = prices[i];
        //    }
        //    if (profit > maxProfit) {
        //         maxProfit = profit;
        //    }
        // }

        // return maxProfit;

        int mini = prices[0], profit = 0;

        for(int stock : prices){
            mini = Math.min(stock,mini);
            profit = Math.max(stock-mini,profit);
        }

        return profit;
    }
    
}


public static void main(String args[]) {
    int prices[] = {7, 1, 5, 3, 6, 4};
    System.out.println("Ans: "+ BuynSellStocks.solve(prices));
}
