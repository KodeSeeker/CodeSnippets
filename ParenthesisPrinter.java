// print all valid combinations of a set of paranthesis provided a input number.

public static void printCombinationsWrapper(int num){

    if(num<=0)
	return;
    int count = num*2;
    char[] str= new char[count*2];
    printParanthesis(num,num,str,0);
    
}

public static void printParanthesis(int leftRem,int rightRem, char[] str,int count )
{

	if(leftRem ==0 && rightRem == 0)
		System.out.println( str);// base case.
	else
	{
	if(leftRem >0)
		{
			str[count]='(';
			printParanthesis(leftRem-1,rightRem,str,count+1);
		}
	if(rightRem>0 && rightRem< leftRem)
		{
			str[count]=')';
			printParanthesis(leftRem,rightRem-1,str,count+1);
		}
	}
}
