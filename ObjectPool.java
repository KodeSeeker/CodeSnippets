/**
Design and implement an object pool, in java.


Key idea here. Use an abstract class that has methods to check in and check out a resource.

Let the implementing classes decide how they want to expire a resource/validate and create a resource.

**/


public abstract class ObjectPool<T>{

	public static final int EXPIRATION_TIME=3000;// 3 secs
	private Hashtable<T,Long> unlocked,locked;

	public abstract T create();
	
	public abstract  boolean validate(T t);
		
	public abstract void expire(T t);
	
	/**
	  Claim a resource from the object pool.
	**/
	public T checkOut() {
		Long now = System.currentTimeMillis();
		T t;
		
		if(unlocked.size() >0) { // if there are unlocked resources
			
			for(Map.Entry<T,Long> resource : unlocked.entrySet()) {
			
				if(resource.getValue()-now >EXPIRATION_TIME) {//Resource is expired..
					unlocked.remove(resource);
					expire(resource);
				}
				
				else {// this resource has not expired.
					
					if(validate(resource)) {// if resource is valid.
						unlocked.remove(resource);
						locked.put(resource,now);
						return resource;
					}
					//invalid resource.. remove from pool.

					else{
						unlocked.remove(resource);
						expire(resource);
					}
				}
			}
		}
			//no valid resources were found in the pool, so we create one..
		T resource = create();
		locked.put(resource,now);
		
		return resource;
	}
	

	/**
	Return an object to the resource pool.
	**/
	
	public void checkIn(T resource) {
		
		if( resource == null)
				throw new IllegalArgumentException();
		unlocked.put(resource,System,currentTimeMillis());
	}



/// Implement class implements the abstract methods. 

}
	
