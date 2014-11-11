
public int maxProdsubset(int[] arr)
{
		int maxEndHere=1;
		int minEndHere=1;
		int maxSubProduct=0;
		//handle cases for all zero's or  zero and negatives upfront.!- TO DO.
		
		
		for(int i=0;i<arr.length;i++)
		{
			//Three cases.
			if(arr[i]>0)// greater than 0.
			{
				maxEndHere*=arr[i];
				minEndHere=Math.min(minEndHere*arr[i],1);//update min ONLY if it lower than flag.
			
			}
			else if(arr[i]==0)// equal to zero
			{
				maxEndHere=1;
				minEndHere=1;
			}
			
			//tricky part need to keep track of max end here- see how the sign affects it and shift it using a temp variable.
			else // negative.
			{
				int temp= maxEndHere;
				maxEndHere= Math.max(minEndHere*arr[i],1);
				minEndHere=temp*arr[i];
			}
			// check if its greater than the maxProd seen so far
			
			if(maxEndHere>maxSubProduct)
				maxSubProduct=maxEndHere;
		}
		
		return maxSubProduct;
}
