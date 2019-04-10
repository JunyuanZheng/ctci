public class Question191 {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            int bit = n & 1;
            result = bit == 1 ? result + 1 : result;
            n >>>= 1;
        }
        return result;
    }
}
