import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int idx = 0; idx < nums.length - 2; idx += 1) {
            if (idx != 0 && nums[idx] == nums[idx - 1])
                continue;
            int low = idx + 1, high = nums.length - 1;
            while (low < high) {
                int value = nums[idx] + nums[low] + nums[high];
                if (value == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[idx]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    while (low + 1 < high && nums[low] == nums[low + 1]) low += 1;
                    while (high - 1 > low && nums[high] == nums[high - 1]) high -= 1;
                    low += 1;
                    high -= 1;
                } else if (value > 0)
                    high -= 1;
                else
                    low += 1;
            }
        }
        return result;
    }
}
