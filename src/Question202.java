import java.util.HashSet;
import java.util.Set;

public class Question202 {
    /*
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int value = 0;
            while (n != 0) {
                int digit = n % 10;
                value = value + digit * digit;
                n = n / 10;
            }
            n = value;
        }
        return n == 1;
    }
    */

    private int digitSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);
        return slow == 1;
    }
}
