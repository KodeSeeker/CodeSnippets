
/** Write a program to compare two arrays and check if they form the same BST.
e,g, 3,2,1,4,5  and 3,4,2,5,1
 Algo: Key point  to note here is that  both of the BST's WILL start with the same element. ie. they will have the same root.
2) The  increasing numbers after the root will be in the same sequence(NOTE: not the same but the same sequence
e.g. 3,..,..4,5 and 3,4,...5
3) Similarly the decreasing numbers will decrease in the same order 3,2,1 and 3,..2,1

ASSUMPTION: NO duplicates.

**/


public boolean sameBSTs(int[] bst1Arr, int[] bst2Arr)
{
	if(bst1Arr[0]!=bst2Arr[0])
		return false;
	if(bst1Arr.length!=bst2Arr.length)
		return false;
	//iterate through the first array
	int[] lessThanRoot= new int[bst1Arr.length];
	int[] biggerThanRoot=new int[bst1Arr.length];
	int less1,more1,root=bst1Arr[0];

	for(int i=1,i<bst1Arr.length;i++)
	{
		if(bst1Arr[i]>root)
		{
			biggerThanRoot[more1]=bst1Arr[i];
			more1 ++;
			continue;
		}
		if(bst1Arr[i]<root)
		{
			lessThanRoot[less]=bst1Arr[i];
			less1++;
		}
		
	}

        int[] lessThanRoot2= new int[bst2Arr.length];
        int[] biggerThanRoot2=new int[bst2Arr.length];
        int less2,more2,root=bst2Arr[0];


	// now check with the second array.
	for(int i=1,i<bst2Arr.length;i++)
	{
		 if(bst2Arr[i]>root)
                {
                        biggerThanRoot2[more2]=bst2Arr[i];
                        more2 ++;
                        continue;
                }       
                if(bst2Arr[i]<root)
                {
                        lessThanRoot2[less2]=bst2Arr[i];
                        less2++;
                }

	}
//now check if less than and more than are the same 

	for(int j=0;j<biggerThanRoot1.length;j++)
	{
		if(biggerThanRoot1[j]!=biggerThanRoot2[j])
			return false;
	}

   	for(int j=0;j<smallerThanRoot1.length;j++)
        {
                if(smallerThanRoot1[j]!=smallerThanRoot2[j])
                        return false;
        }

	//meets condition at this point so return true;
	return true;
}

