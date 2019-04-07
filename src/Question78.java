import java.util.ArrayList;
import java.util.List;

public class Question78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return list;
        List<Integer> tmp = new ArrayList<>();
        helper(list, tmp, nums, 0);
        return list;
    }

    private void helper(List<List<Integer>> result,  List<Integer> tmp, int[] nums, int idx) {
        result.add(new ArrayList<>(tmp));
        for (int i = idx; i < nums.length; i += 1) {
            tmp.add(nums[i]);
            helper(result, tmp, nums, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
