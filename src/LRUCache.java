import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int CACHE_SIZE;

    public LRUCache(int cachSize){
        super((int)Math.ceil(cachSize/0.75)+1,0.75f,true);
        CACHE_SIZE=cachSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>CACHE_SIZE;
    }
}
