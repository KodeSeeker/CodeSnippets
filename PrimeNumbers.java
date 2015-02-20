/**
Write a program to generate the prime numbers upto N.
Approach: Sieve of Erastosthenes.
http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
http://leetcode.com/2010/04/finding-prime-numbers.html
**/
public void printPrimes(int N)
{

	boolean[] prime = new boolean[N];
	//mark all as prime first.
	for(int i=0;i<N;i++)
		prime[i]=true;
	//calculate limit
	int limit= Math.sqrt(n);
	for(int i=2;i<=limit;i++)
	{
		if(prime[i])// score of all of its multiples.
		{
			for(int j=i;j<=n;j+=i)
			{
				prime[j]=false;
			}
		}
	}
	//above approach O(loglog n)
	//O(n ) to print out numbers
	for(int i=0;i<prime.length<i++)
	{	if(prime[i])
			System.out.println(i);

	}
}
