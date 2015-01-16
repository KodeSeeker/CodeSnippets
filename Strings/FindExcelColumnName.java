

public String getColumnName(int N)
{
	if(N<0)
	return null;
	StringBuilder name= new StringBuilder();// to store the string representation.
	// we offset the 0 to 26 calculation to 1 to 27.
	while(N>0)
	{
		N--;// to adjust offset.
		name.append((char)('A'+N%26));
		N/=26;
	}
	
	return name.toString();
}
	
