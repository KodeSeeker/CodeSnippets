/*
Assume primitive Facebook. FB has Members. 
class Member { 
String name; 
String email; 
List<Member> friends; 
} 
Question A: 
Code printSocialGraph(Member m). Direct friends of m are Level 1 friends. Friends of friends are level 2 friends.....and so on 
Print level 1 friends first. Then print level 2 friends....and so on

Solution : Breadth first traversal.
*/

public void printSocialGraph(Member m)
{
  	if (m== null)
    		return; // base case.
    	//BFS -Queue
  	Queue <Member> q= new LinkedList<Member>();
  
	// Use a HashMap to store the level of the member friend.
 	 Map<Member,Integer> map= new HashMap<Member,Integer>();
  	 level=-1;
  	 map.put(m,0); // m is at level 0.
  	 q.add(m);
  

  //BFS
  while(!q.isEmpty()
  {
    	Member current= q.poll();
    	//check the level- this prevents reprinting of a member.
   	 if(map.get(current)>level)
 		{
			//print the level .
			System.out.println("Level" + level);	
 		}
	//print the member
	System.out.println("Member name " +current.name);
	
	//add his friends to the queue.
	for (Member frnd: current.friends)
	{
		//add to the queue and set the level in the map.
		q.add(frnd);
		map.put(frnd,++level);// increment the level. and add to map.
	}

  }  
