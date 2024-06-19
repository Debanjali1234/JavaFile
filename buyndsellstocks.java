import java.util.*;

public class buyndsellstocks {
    public static int BUYANDSELLSTOCKS(int prices[]) {
        int buyprices = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyprices < prices[i]) {
                int profit = prices[i] - buyprices;        // (profit)
                maxprofit = Math.max(maxprofit, profit);
            } else {

                buyprices = prices[i];                 //(loss)

            }

        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 3, 6, 7, 8, 2, 5 };

        int maxprofit = BUYANDSELLSTOCKS(prices);
        System.out.println("max profit is " + maxprofit);

    }

}