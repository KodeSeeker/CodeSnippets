/**
Given a range of numbers , find the missing numbers using the least amount of memory. ie. use a BitSet.
**/


public class BitSet
{
	int[] bitset;// bitset vector.
	//initialise the bitset vector
	public BitSet(int size)
	{
		bitset= new int[(size>>5) +1];// compress -- dividing  range by 32
	}
	
	//sets a number in the bitset
	public void set(int num)
	{
		int wordNumber= num>>5;// divide by 32
		int bitPos= num & 0x1F;// bitwise and 32 to find the bit.
		bitset[wordNumber] | = 1<<bitPos;
	}

	//checks if the number exists in the bitset.
	public boolean get (int num)
	{
		int wordNumber= num>>5;//divide by 32.
		int bitPos= num & 0x1F;// find the correct bit.
		return (bitset[wordNumber] & (1<<bitPos)) ==1;// if the number exists in the bitset this evaluates to true.
	}
}
