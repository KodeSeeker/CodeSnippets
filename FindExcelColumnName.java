/*
The function finds the column name corresponding to the number provided 
*/
public string getNthColumnName(int N)
{
  
  if(N<0)
    return null;
    String colmnName;
  while(N>=0)
  {
    N--;
    columnName+=char(N%26);
    N=N/26;
  }
  return columnName;
}
