
/*
e.g N=11000000000
M=10011
i=2;j=6
Output N= 1000101100
*/

int insertSmallIntoLarge(int n, int m)
{
  
  // first need to create a bit mask, to help blank out j-i digits of N.
  int allOnes=~0;// sequence of 1's
  int left =allOnes<<(j+1);//1111000000
  int right=(1<<i)-1;//1s00-1=0s11
  
  int mask=left|right;// mask now has only the bits that will be occupied by M blanked out!111100001111
  int n_masked=n&mask;// n will mask only the space occupied by M-> N=1000/00000/000
  int m_shifted=m<<i;// shift m so that its at the right spot
  return n_masked|m_shifted;
  
  
  
}