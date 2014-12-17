//Find the number of bit swaps needed to change from number A to B
// e.g A =111 and B=010. Bit swaps =2

// key here is the A xor B ->contains the number of bits that are different between a and b
// so we just need to count number of set bits in A xor B

public int countSwaps(int a, int b)
{
  int count=0;
  for(int c=a^b,c!=0;c=c&(c-1))
  {
    count++;
  }
  return count;
}