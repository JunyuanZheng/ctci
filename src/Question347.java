import java.util.*;

public class Question347 {
    /*
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(0, pq.poll().getKey());
        }
        return result;
    }
    */

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        ArrayList<Integer>[] frequency = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            int value = entry.getKey();
            if (frequency[freq] == null) {
                frequency[freq] = new ArrayList<>();
            }
            frequency[freq].add(value);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length; i >= 0 && list.size() < k; i -= 1) {
            if (frequency[i] != null) {
                list.addAll(frequency[i]);
            }
        }
        return list;
    }
}
