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
    return;
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
      Sysout("Level"+ ++level);// print the current level.
    }
  
  // now print the member
  Sysout ("Member" +curr.name);
  
  // Add the members too
  for(  Member friend: curr.friends)
  {
    map.put(friend,++level);
    q.add(friend);
  }
  
  }  
