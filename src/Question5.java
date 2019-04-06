public class Question5 {
    private String result;

    public String longestPalindrome(String s) {
        result = "";
        for (int i = 0; i < s.length(); i += 1) {
            helper(s, i, i);
            helper(s, i, i + 1);
        }
        return result;
    }

    private void helper(String s, int start, int end) {
        while (start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)) {
            start -= 1;
            end += 1;
        }
        start += 1;
        end -= 1;
        String sub = s.substring(start, end + 1);
        if (sub.length() > result.length())
            result = sub;
    }
}
