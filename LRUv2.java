/**
Modified version of LRU cache.
Needs validation. How to improve Runtime?? 
**/
class LRU {
	int size;
	Map<ID,Node> map;
	Queue<ID> queue;
	
	public LRU( int size) {
		this.size = size;
		map = new HashMap<ID,Node>();
		queue = new LinkedList<ID>();// Doubly linked list maybe?
	}	 

	
	public void put(ID id , Node n) {
		
		if(id == null || n == null)
			throw new IllegalArgumentException();
		if(map.containsKey(id)) {
			queue.remove(id);//O(n)
			queue.add(id);
			return;
		}
		if(queue.size()>size){
			ID rem = queue.poll();//remove from first.
			if(rem!=null)
				map.remove(rem);
		}
		
		map.put(id,n);
		queue.add(id);
	}

	
	public Node  get(ID id){
		
		if(!map.containsKey(id)){
			return null;
		}
	
		queue.remove(id);//O(n)
		queue.add(id);
		
		return map.get(id);
	}



