import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() == 0)
            return 0;
        int left = 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i += 1) {
            char c = s.charAt(i);
            if (map.containsKey(c))
                left = Math.max(left, map.get(c) + 1);
            map.put(c, i);
            result = Math.max(result, i - left + 1);
        }
        return result;
    }
}
