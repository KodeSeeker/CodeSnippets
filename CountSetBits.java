//this version is wrong. Needs fixing. Brian Kernighan appraoch is best. 
private int countSetBits(int num){

//loop from i to n
  int bitCount=0;
  for(int i=0;i<num;i++)
    bitCount+=countBitsUtil(i);
  
  return bitCount;

}

int CountBitsUtil(int n){
  
  if(n<=0)
    return 0;
  return( (n%2==0?0:1)+CountBitsUtil(n/2));
}

