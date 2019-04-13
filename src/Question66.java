public class Question66 {
    public int[] plusOne(int[] digits) {
        int overflow = 1;
        for (int i = digits.length - 1; i >= 0; i -= 1) {
            int digit = digits[i] + overflow;
            if (digit < 10) {
                digits[i] += overflow;
                return digits;
            }
            overflow = digit / 10;
            digit %= 10;
            digits[i] = digit;
        }
        int[] newNumber = new int [digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
