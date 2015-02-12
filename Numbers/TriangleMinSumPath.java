/**
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

Approach Use DP and keep calculate path bottom up.
Key insight the sum at any given node can be node[i][j]+Min(left, right).

**/

public int minSum(ArrayList<ArrayList<Integer>> triangle) {

if(triangle ==null || triangle.size()==0)
	throw new IllegalArgumentException();

int[] sums= new int[triangle.size()-1]; 
//start with initializing sum to all the values from the last row. 

int levels=triangle.size()-1;

for(int j=0;j<triangle.get(levels).size();j++) {

sums[j]= triangle.get(level).get(j);
}

// calculate the min sum bottom up.
for (int i= triangle.size()-2;i>=0;i--) {
	for (int j=0;j<triangle.get(i+1).size()-1;j++) { 
	//min sum for a level is calculated based on the sums 
	// on the next level.
	sums[j]= triangle.get(i).get(j)+Math.min(sums[j],sums[j+1]);
	//replace with max for max sum path
	}
}	
	return sums[0];// this will contain the actual min sum as the tree rolls up.
}
