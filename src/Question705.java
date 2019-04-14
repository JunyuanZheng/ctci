import java.util.HashMap;

public class Question705 {
    class MyHashSet {
        HashMap<Integer, String> map;

        /** Initialize your data structure here. */
        public MyHashSet() {
            map = new HashMap<>();

        }

        public void add(int key) {
            map.put(key, "");
        }

        public void remove(int key) {
            map.remove(key);
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return map.containsKey(key);
        }
    }

}
