/**
Given a corridor with 500 doors. Initially all doors are closed.

1st guy opens all the doors. 2nd guy closes alternate doors . The ith guy toggles the ith door. 
Which door is open after the 500th guy walks through the corridor?


**/

/**
Key inisght: A door is  open IFF it has been toggled odd number of times, else closed.

A door K  is toggled odd no. of times  only if  K^2  IS  A PERFECT SQUARE.

IE. DOOR K IS OPEN IFF K = N^2. FOR SOME VALUE OF N.
**/


public boolean isDoorOpen(int i) {

	int floored_sqrtI= Math.floor(Math.sqrt(i));
	
	return (floored_sqrtI *floored_sqrtI == i);
}

	


