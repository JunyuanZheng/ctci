import java.util.Arrays;
import java.util.Comparator;

public class Question179 {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return "0";
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i += 1) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strings, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        if (strings[0].equals("0"))
            return "0";
        return String.join("", strings);
    }
}
