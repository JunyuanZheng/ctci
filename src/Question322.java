import java.util.Arrays;

public class Question322 {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for (int i = 1; i <= amount; i += 1) {
            for (int coin : coins) {
                if (i - coin >= 0 && memo[i - coin] != Integer.MAX_VALUE)
                    memo[i] = Math.min(memo[i - coin] + 1, memo[i]);
            }
        }
        return memo[amount] == Integer.MAX_VALUE ? -1 : memo[amount];
    }
}
