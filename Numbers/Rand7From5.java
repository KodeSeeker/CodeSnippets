
/** 

Given a number that generates rand5(): numbers in the range 1 to 5.
Write a method that implements rand7().
**/

public static int rand7()
{
	// intiailize a 2 dimensional vector that has equal number of non-zero elements that are divisible by 7.
	int[] [] vals= {{1,2,3,4,5},
			{6,7,1,2,3},
			{4,5,6,7,1},
			{2,3,4,5,6}
			{7,0,0,0,0}};
	int i,j;
	int result =0;
	while (result ==0)
	{
		int i=rand5();
		int j= rand5();
		result=vals[i][j];// randomly selected value in the range 1-7.
	}

	return result;
}

