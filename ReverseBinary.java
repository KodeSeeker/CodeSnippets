/**
Write a method that reverses the binary notation for a  given input number 


approach : Uses xor-swap to emulate the string reversal.
Walk down the string till the middle while swapping the elements in the front and the back.
**/


public int  reverseBinary(int bin)
{
    if(bin==0|| bin==1)// basically length 1.
        return bin;
    // apply string reversal type approach.
    //length of a number in java is always 32 bits!!
    
    for(int i=0;i<32;i++)
    {
        bin=xorSwap(bin,i,n-1-i); //does the actual swapping.
    }
   
   return bin;
 }
 
 
 public int xorSwap(int num, int i,int j);
 {
     //get the actual bit at i and j.
	int lo= (num>>i) &1;
	int hi=(num >>j) &1;
	if(lo!=hi) // we need to swap because they are different!-- swapping is performed by toggling the bits at those indexes.
	{
		num^= (1<<i)|(1<<j);
	}
	
	return num;
}

