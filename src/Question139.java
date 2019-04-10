import java.util.List;

public class Question139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] result = new boolean[s.length() + 1];
        result[0] = true;
        for (int i = 1; i <= s.length(); i += 1) {
            for (int j = 0; j < i; j += 1) {
                if (result[j] && wordDict.contains(s.substring(j, i))) {
                    result[i] = true;
                    break;
                }
            }
        }
        return result[s.length()];
    }
}
