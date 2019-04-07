import java.util.ArrayList;
import java.util.List;

public class Question22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, "", 0, 0, n);
        return list;
    }

    private void helper(List<String> list, String s, int open, int close, int max) {
        System.out.println(s);
        if (s.length() == max * 2)
            list.add(s);
        if (open < max)
            helper(list, s + "(", open + 1, close, max);
        if (close < open)
            helper(list, s + ")", open, close + 1, max);
    }
}
