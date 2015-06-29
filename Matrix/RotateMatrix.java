/* Given an n*n matrix. Rotate it by 90 degrees clockwise
Based on the fact that mat[i][j] becomes mat[n-1-j][i] 
*/

//In place rotation.

public void rotateMatrix(int [] [] in)
{

for(int i=0;i<in.length/2;i++)
{
	for(int j=0;j<n-1-i;i++)
	{
		int temp= in[i][j];//store in temp variable
		in[i][j]=in[n-1-j][i];
		in[n-1-j][i]=in[n-1-i][n-1-j]
		in[n-1-i][n-1-j]=in[j][n-1-i]
		in[j][n-1-i]=tmp;
	}
}
}
