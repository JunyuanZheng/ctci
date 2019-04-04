import java.util.HashMap;

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i += 1) {
            int value = target - nums[i];
            if (map.containsKey(value))
                return new int[] { map.get(value), i };
            map.put(nums[i], i);
        }
        return null;
    }
}
