/**
Find the overlap in the form of a rectangle between two rectangles in a coordinate system.

The key here is to break down the problem into two separate problems.

ie. Finding the overlap in the x and y axes.

The overlap in any one axis is given by: |lowest end point-highest start point|.


You are given the  height and width of each rectangle and bottom left corner of each rectangle.
**/

class Rect 
{
	int x;
	int y;
	int height;
	int width;
}

public Rect findOverlap( Rect a,Rect b)
{
	if(a==null||b==null)
		return null;
	int[] xParams=new int[2];//[start_point,overlapwidth]
	int[] yParams= new int[2];
	 xParams=findOverlapLength(a.x, a.width,b.x,b.width);
	yParams=findOverlapLength(a.y,a.height,b.y,b.width0);

	//Check if there is any overlap!	
	if(xParams==null||yParams==null)
		return null;
	
	//there is a rectangle to return!
	Rect overlap= new Rect();
	overlap.x=xParams[0];
	overlap.y=yParams[0];
	overlap.width=xParams[1];
	overlap.height=xParams[1];

	return overlap;
}

public int[]  findOverLapLength( int a,int aSide, int b, int bSide)
{

	int lowest_end_point= Math.min(a+aSide,b+b.bSide);

	int highest_start_point= Math.max(a,b);

	if(highest_start_point >=lowest_end_point)
		return null; // there is no overlap!
	overlap=lowest_end_point-highest_start_point;
	int [] params = new int[]{highest_start_point,overlap};		
	return params;
}


