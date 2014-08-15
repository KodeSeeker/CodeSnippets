inf f(int num, int car=0)
{
  car *=10;
  if((num/10) == 0)
    return ( car + num );
 else
    return f(num/10, car+(num%10) );
}