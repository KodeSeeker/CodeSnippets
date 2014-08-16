/**
There are people standing in a circle waiting to be executed. The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom.

The task is to choose the place in the initial circle so that you are the last one remaining and so survive.
**/
// key function here is f(n,k) = (f(n-1,k)+ k-1) mod n +1

//iterative. 
public int josepheus (int n , int k )
{
	int r=0; // remaining index.
	for(int i=2;i<n;i++)
	{
		r=( r+k)%i;
	}
	
	return r;
}


public int josepheus (int n, int k)
{
	if (n==1)
		return 1;
	else
		return ((josepheus(n-1,k) + k-1) %n) +1;

}
