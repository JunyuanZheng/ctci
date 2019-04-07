public class Question70 {
    public int climbStairs(int n) {
        if (n < 1)
            return 1;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i += 1) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
