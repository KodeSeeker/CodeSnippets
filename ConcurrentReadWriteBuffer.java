/**
Design a concurrent read write buffers, that allows for reading when writing takes place. Accomodates for multiple  readers. 

Approach : Using built in  readerWriter Lock in Java. 

**/



class Buffer {

	public StringBuffer sb = new StringBuffer();
	public ReentrantReadWriteLock lock = new ReeentrantReadWriteLock(true);// to ensure fair assignment of threads based on their arrival. 
	Random rndm = new Random();				

	public void read(){
		
		try {
			lock.readLock().lock(); // obtain read lock !
			System.out.println(sb.toString());// print buffer!
		}
		
		finally{
			lock.readLock.unlock();// release readLock in finally
		}
	}
		
	public void write(){
		
		try { 
			lock.writeLock().lock();// obtain write lock.
			sb.append(rndm.nextInt());//
		}
		finally {

			lock.writeLock().unlock();//release write lock
		}	
	}

}

