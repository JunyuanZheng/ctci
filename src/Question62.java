import java.util.Arrays;

public class Question62 {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        int[] memo = new int[m];
        Arrays.fill(memo, 1);
        for (int i = 1; i < n; i += 1) {
            for (int j = 1; j < m; j += 1) {
                memo[j] = memo[j] + memo[j - 1];
            }
        }
        return memo[m - 1];
    }
}
