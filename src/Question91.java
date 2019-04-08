public class Question91 {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int size  = s.length();
        int[] memo = new int[size];
        memo[0] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < size; i += 1) {
            int first = Integer.valueOf(s.substring(i - 1, i + 1));
            int second = Integer.valueOf(s.substring(i, i + 1));
            if (first >= 10 && first <= 26)
                memo[i] += i - 2 < 0 ? 1 : memo[i - 2];
            if (second >= 1 && second <= 9)
                memo[i] += memo[i - 1];
        }
        return memo[size - 1];
    }
}
