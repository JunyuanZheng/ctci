import java.util.*;

public class Question384 {
    /*
    class Solution {
        int[] origin;
        Random random;

        public Solution(int[] nums) {
            origin = nums.clone();
            random = new Random();
        }

        public int[] reset() {
            return origin;
        }

        public int[] shuffle() {
            List<Integer> list = new ArrayList<>();
            for (int num : origin)
                list.add(num);
            int[] results = new int[origin.length];
            for (int i = 0; i < origin.length; i += 1) {
                int idx = random.nextInt(list.size());
                results[i] = list.get(idx);
                list.remove(idx);
            }
            return results;
        }
    }
    */

    class Solution {
        int[] origin;
        Random random;

        public Solution(int[] nums) {
            origin = nums.clone();
            random = new Random();
        }

        public int[] reset() {
            return origin;
        }

        public int[] shuffle() {
            int[] result = origin.clone();
            for (int i = 0; i < result.length; i += 1) {
                int idx = random.nextInt(result.length - i) + i;
                int tmp = result[i];
                result[i] = result[idx];
                result[idx] = tmp;
            }
            return result;
        }
    }
}
