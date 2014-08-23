/**
	Problem 9.10 CTCI
	Given a set of boxes how would you arrange them such that the smaller ones are always on top of the larger ones
	Boxes cannot be rotated and can only be stacked on top of each other.
	Each box has a height,breadth and width.
	Naive approach will be sort all boxes by descending height- but we dont have access to all of them at the same time!

Approach: Take a box as the bottom and recursively compute the largest stack with it as the base.And return an arraylist representing the configuration.
	
**/


public ArrayList<Box> arrangeBoxesRecursively(Box[]boxes, Box bottom)
{

	if(boxes.length==0 || boxes==null)
		return null;
 
	List<Box> max_stack= new ArrayList<Box>();
	int max_height=0
	
	List<Box> newStack;// temp placeholder.
	if(bottom!=null)
	{
	 maxstack.add(0,bottom);
	}
	for(int i=0;i <boxes.length;i++)
	{
		if (boxes[i].canBeAbove(bottom)) //assuming there is a helper function 
			{	
				newStack= arrangeBoxesRecurisvely(boxes,boxes[i]);
				int new_height= getHeight(maxStack);
				if(new_len>maxLen)
				{
					max_stack=new_stack;
					max_len=new_len;
				}
				
			}
	}	
	
	return max_stack;
}

/**
Flaw with above approach ^ --- Several recursive calls.!Instead if we can store the max_stack for each box . ie . store the boxes smaller than it in a map and pass it.

Map<Box,List<Box>//smaller than the box .
**/

public ArrayList<Box> arrangeBoxesDP(Box[] boxes, Box bottom,HashMap<Box,ArrayList<Box>>() boxMap)
{


	if(boxes.length==0 || boxes==null)
                return null;
 
        List<Box> maxStack= new ArrayList<Box>();


	
	for(int i=0;i <boxes.length;i++)
        {
                if (boxes[i].canBeAbove(bottom)) //assuming there is a helper function 
                        { 
                                newStack= arrangeBoxesDP(boxes,boxes[i],boxMap);//not sure.
                                int new_height= getHeight(maxStack);
                                if(new_len>maxLen)
                                {
                                        max_stack=new_stack;
                                        max_len=new_len;
                                }

                        }
	}

	 if(bottom!=null)
        {
                max_stack.add(0,bottom); // add the box to the bottom of the max stack
                boxMap.put(bottom,maxStack);
        }


	return maxStack;

}
