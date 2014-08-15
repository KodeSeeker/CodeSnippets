import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LRUCache<K,V> {
  private ConcurrentHashMap<K,V> map;
  private ConcurrentLinkedQueue<K> queue;
  private final int size; 

  public LRUCache(int size) {
    this.size = size;
    map = new ConcurrentHashMap<K,V>(size);
    queue = new ConcurrentLinkedQueue<K>();
  }

  public V get(K key) {
    //Recently accessed, hence move it to the tail
    queue.remove(key);
    queue.add(key);
    return map.get(key);
  }

  public void put(K key, V value) {
    //ConcurrentHashMap doesn't allow null key or values
    if(key == null || value == null) throw new NullPointerException();
    if(map.containsKey(key) {
      queue.remove(key);
    }
    if(queue.size() >= size) {
      K lruKey = queue.poll();
      if(lruKey != null) {
        map.remove(lruKey);
      }
    }
    queue.add(key);
    map.put(key,value);
  }