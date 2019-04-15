public class Question8 {
    public int myAtoi(String str) {
        int result = 0, idx = 0;
        boolean negative = false;

        while (idx < str.length() && str.charAt(idx) == ' ')
            idx += 1;

        if (idx < str.length() && (str.charAt(idx) == '-' || str.charAt(idx) == '+')) {
            if (str.charAt(idx) == '-')
                negative = true;
            idx += 1;
        }

        while (idx < str.length() && str.charAt(idx) >= '0' && str.charAt(idx) <= '9') {
            int potential = result * 10 + (str.charAt(idx) - '0');
            if (potential / 10 != result) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = potential;
            idx += 1;
        }

        return negative ? -result : result;
    }
}
