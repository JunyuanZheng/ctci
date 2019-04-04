import java.util.LinkedHashMap;
import java.util.Map;

public class Question146 {
    class LRUCache {
        int size;
        LinkedHashMap<Integer, Integer> map;

        public LRUCache(int capacity) {
            size = capacity;
            map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return size() > size;
                }
            };
        }

        public int get(int key) {
            return map.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            map.put(key, value);
        }
    }

}
