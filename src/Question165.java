public class Question165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int size = Math.max(v1.length, v2.length);
        for (int i = 0; i < size; i += 1) {
            int n1 = i < v1.length ? string2int(v1[i]) : 0;
            int n2 = i < v2.length ? string2int(v2[i]) : 0;
            if (n1 < n2)
                return -1;
            else if (n1 > n2)
                return 1;
        }
        return 0;
    }

    private int string2int(String s) {
        int num = 0;
        for (char c : s.toCharArray())
            num = num * 10 + c - '0';
        return num;
    }
}
