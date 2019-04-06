public class Question7 {
    public int reverse(int x) {
        boolean negative = x < 0;
        int result = 0;
        x = Math.abs(x);
        while (x > 0) {
            int potential = result * 10 + x % 10;
            if (potential / 10 != result)
                return 0;
            result = potential;
            x /= 10;
        }
        return negative ? -result : result;
    }
}
