import java.util.*;

public class Question380 {
    class RandomizedSet {
        HashMap<Integer, Integer> map;
        ArrayList<Integer> list;
        Random random;

        /** Initialize your data structure here. */
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if (map.containsKey(val))
                return false;
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if (!map.containsKey(val))
                return false;
            int idx = map.get(val);
            int tmp = list.get(idx);
            list.set(idx, list.get(list.size() - 1));
            map.put(list.get(idx), idx);
            list.set(list.size() - 1, tmp);
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            int idx = random.nextInt(list.size());
            return this.list.get(idx);
        }
    }
}
