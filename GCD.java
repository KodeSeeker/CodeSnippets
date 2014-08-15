
public static int iterativeGCD(int a,int b)
{
  while(a!=0 && b!=0)
  {
    int c=b;// store b in temp variable
    b=a%b;
    a=c;//move b to a.
    
  }
  return a+b;
}

public static recGCD(int a, int b)
{
  if(a ==0|| b==0)return a+b;
  
  return recGCD(b,a%b);
}