/**
The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days.
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
**/
/**
 @args price- represents the stock prices for an arbitary time period. 
@return: returns an array representing the span of each price.
**/
public static int[]  StockSpan(int[] prices)
{
	if (prices ==null )
		return null;
	
	Stack<Integer> st = new Stack<Integer>();  //holds the index of the prices  that have greater  value than the current price
	int [] span= new int[prices];
	span[0]= 1;	// the span of the first element is always 1.
	st.push(0);	


	for(int i=1;i<prices.length;i++)
	{
		
		//pop out all values from the stack that are lesser than the current price
		while(!st.isEmpty() && (price[st.peek()] < price[i]))
			st.pop();
		
		//now find value of Span[i]
		//if stack is empty at this point -> price[i] is the largest price seen so far traversing  from left.
		//else the value of span is the value of i-st.peek()
		span[i] = (!st.isEmpty()?i- stack.peek():i+1);
		
		//push the value of the index to stack
		st.push(i);
	}


	return span;
	
}
