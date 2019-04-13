public class Question29 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean negative = dividend < 0 ^ divisor < 0;
        if(dividend > 0) dividend = -dividend;
        if(divisor > 0) divisor = -divisor;
        int result = helper(dividend, divisor);
        return negative ? -result : result;
    }

    private int helper(int dividend, int divisor) {
        if (dividend > divisor)
            return 0;
        int preSum = divisor;
        int curSum = divisor << 1;
        int result = 1;
        while (curSum > dividend && curSum < preSum) {
            preSum = curSum;
            curSum <<= 1;
            result <<= 1;
        }
        return result + helper(dividend - preSum, divisor);
    }
}
