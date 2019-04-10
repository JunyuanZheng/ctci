public class Question204 {
    public int countPrimes(int n) {
        boolean[] mask = new boolean[n + 1];
        int result = 0;
        for (int i = 2; i < n; i += 1) {
            if (!mask[i]) {
                result += 1;
                for (int j = 2; i * j < n; j += 1)
                    mask[i * j] = true;
            }
        }
        return result;
    }
}
