/*
The functio finds the column name corresponding to the number provided 
*/
public string getNthColumnName(int num)
{
  
  if(N<0)
    return null;
    String colmnName;
  while(n>=0)
  {
    N--;
    columnName+=char(N%26);
    N=N/26;
  }
  return columnName;
}