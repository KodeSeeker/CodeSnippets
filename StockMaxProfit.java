/*
I have an array stockPricesYesterday where the keys are the number of minutes into the day (starting with midnight)
and the values are the price of Apple stock at that time. For example, the stock cost $500 at 1am,
so stockPricesYesterday[60] = 500.
Write an efficient algorithm for computing the best profit I could have made from 1 purchase
and 1 sale of an Apple stock yesterday.
*/

//very trivial O(n) time and O(1) space.

// key is to find the MAX profit ie. Highestprice_yest- lowest price yesterday.
public static int maxProfit(int[] stockPricesYesterday)
{
  // initially max_profit=0.
  // min_price= arr[0]
  
  int mx_profit=0;
  int min_price=stockPricesYesterday[0];
  for (int i=0;i< stockPricesYesterday.length;i++)
  {
    int current_price=stockPricesYesterday[i];
    min_price= Math.min(current_price,min_price);
    mx_profit=Math.max(current_price-min_price,mx_profit);
  }
  
  return mx_profit;
}

