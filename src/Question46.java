import java.util.ArrayList;
import java.util.List;

public class Question46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(lists, tmp, nums);
        return lists;
    }

    private void helper(List<List<Integer>> lists, List<Integer> tmp, int[] nums) {
        if (tmp.size() == nums.length) {
            lists.add(new ArrayList<>(tmp));
        }
        for (int i = 0; i < nums.length; i += 1) {
            if (tmp.contains(nums[i]))
                continue;
            tmp.add(nums[i]);
            helper(lists, tmp, nums);
            tmp.remove(tmp.size() - 1);
        }
    }
}
