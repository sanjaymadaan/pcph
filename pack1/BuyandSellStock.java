package pack1;

public class BuyandSellStock {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int []{3,2,6,5,0,3}));
		System.out.println(maxProfit(new int []{7,6,5,4,3,2}));
		System.out.println(maxProfit(new int []{12,14,15,2,16,1}));
	}

    public static int maxProfit(int[] prices) {
    	 if (prices == null || prices.length < 2) {
             return 0; // No profit can be made
         }

         int minPrice = Integer.MAX_VALUE;
         int maxProfit = 0;

         for (int price : prices) {
             // Update the minimum price seen so far
             if (price < minPrice) {
                 minPrice = price;
             }
             // Calculate profit and update maxProfit if it's greater
             else if (price - minPrice > maxProfit) {
                 maxProfit = price - minPrice;
             }
//             System.out.println("\nMin Price = "+minPrice);
//             System.out.println("Max Profit = " + maxProfit);
         }

         return maxProfit;
         }
}



