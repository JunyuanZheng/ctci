public class Question50 {
    public double myPow(double x, int n) {
        x = n >= 0 ? x : 1 / x;
        n = Math.abs(n);
        return fastPow(x, n);
    }

    private double fastPow(double x, int n) {
        if (n == 0)
            return 1;
        double sub = fastPow(x, n / 2);
        if (n % 2 == 0)
            return sub * sub;
        else
            return sub * sub * x;
    }
}
