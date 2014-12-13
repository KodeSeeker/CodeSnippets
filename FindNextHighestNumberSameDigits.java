/**
http://www.geeksforgeeks.org/find-next-greater-number-set-digits/

Key Observations
1) If the number is strictly increasing. Swap the last two digits and return. 1234->1243.

2) If the number is strictly decreasing. There is no higher number of same digits. 4321->"Not possible".

3) All other cases . Look at each digit of the number from right to left. If you find a position where the value of a number is less than the one on its right.
	Scan rightward and find the next smallest number on the right, swap .
	Sort rightward from the swap point.

534976-> Swap 4 with 6. -> 536974. Sort the part after the swap. 534976.

**/



public int[] createArray(in num)
{
	int[] placeHolder= new int[10];
	int count =0;
	StringBuiler rev= new StringBuilder();
	while(num>0)
	{
		int d= num%10;
		rev.append(d);
		num/=10;
	}
	
	rev.reverse();
	for(Character c: rev.toString().tocharArray())
	{
		placeHolder[count++]=(int)c;
	}
	
	int []numAr = new int[count];
	for(int j=0;j<count;j++)
	{
		numAr[j]=placeHolder[j];
	}
	
	return numAr;
}


	

public void  nextHighestNumber (int num)
{

	if(num<0)
		throw new IllegalArgumentException();
	int[] numArr= createArray(num);

	// all decreasing?
	boolean dec=true;
	for(int i=numArr.length()-1;i>=1;i--)
	{
		if(numArr[i]<numArr[i+1])
		{
			dec=false;
		}
	}
	
	if(dec)
	{
		System.out.print("Next highest number not possible");
		return;
	}

	//all increasing?

 	 boolean inc=true;
        for(int i=numArr.length()-1;i>=1;i--)
        {
                if(numArr[i]>numArr[i+1])
                {
                        inc=false;
                }
        }

        if(inc)
        {	
		//swap last two numbers in numArr. Return
               	//Print number . Return.
                
        }

//other cases.

//Search for first index where left is less than right.

int tmp =numArr.length-1;
int pos=-1;
while(tmp>0)
{
	if(arr[tmp]<arr[tmp+1])
		pos=tmp;
}

//search for minima on the right side of tmp.
if(pos==-1)
	return;// error condition.
int min=-1;

for (int k= pos+1;k<inArr.length-1;i++)
	{
		if(min<numArr[i])
			minIndex=i;
	}


//swap element at minIndex and pos.

//sort part after new pos.

//print number

}

