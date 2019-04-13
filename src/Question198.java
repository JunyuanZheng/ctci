public class Question198 {
    public int rob(int[] nums) {
        int i = 0;
        int e = 0;
        for (int num : nums) {
            int tmp = i;
            i = num + e;
            e = Math.max(tmp, e);
        }
        return Math.max(i, e);
    }
}
