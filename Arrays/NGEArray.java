// Core idea is to use space to improve over the brute force appraoch


/**
ray [4, 5, 2, 25}, the next greater elements for each element are as follows.

Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
d) For the input array [13, 7, 6, 12}, the next greater elements for each element are as follows.

  Element        NGE
   13      -->    -1
   7       -->     12
   6       -->     12
   12     -->     -1
**/

void printNGE(int [] arr) {


	if(arr== null)
		throw new IllegalArgumentException();

	if(arr.length ==1 )
		System.out.println(arr[0] + " ->  -1" );

	//stack used to maintain numbers till we find the next greater num.
	Stack<Integer>  nums = new Stack <Integer>();
	nums.push(arr[0]);
	for (int i=1;i<arr.length;i++) {
			
		int element = nums.pop();
		
		int next = arr[i];

		  //multiple elements could have "next" as the Next greater element.
		while(next > element) {
			
			System.out.print( element +  " -> " next);
			// nums is empty break!!	
			if(nums.isEmpty())
				break;

			element = nums.pop();
		}
		//next is actually smaller. so push it into array.
		if(next <element) {
			nums.push(next);
		}
	}

// at this point num only has elements  that dont have a next larger element. so Print with -1.

	while(!nums.isEmpty()) {
		System.out.println(nums.pop() + " ->  -1 ");
	}
}

 


	
