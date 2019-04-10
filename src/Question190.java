public class Question190 {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i += 1) {
            int bit = n & 1;
            result = (result << 1) | bit;
            n >>>= 1;
        }
        return result;
    }
}
