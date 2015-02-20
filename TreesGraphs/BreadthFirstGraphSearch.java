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

public void printSocialGraph(Member m) {

if( m == null) 
     return;

	Queue<Member>  queue = new LinkedList<Member>();
	Map<Member,Integer> levels = new HashMap<Member,Integer>();

	queue.add(m);
	levels.put(m,1);// levels to keep track of members  in  different levels.

	int currlevel =0;// variable to keep track of level change.

	while(!q.isEmpty()) {

     	Member current = queue.remove();
      	if(levels.get(current) > currLevel) { //we’ve seen a new level!
               System.out.print(“At level” +levels.get(current));
               currLevel= levels.get(current);
	}              
     System.out.print(current.data);
     
     for(Member friend : current.friends) {

               queue.add(friend);
               map.put(friend,map.get(current) +1 );
      }


}

}




