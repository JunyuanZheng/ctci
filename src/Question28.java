public class Question28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        for (int i = 0; ; i += 1) {
            for (int j = 0; ; j += 1) {
                if (j == needle.length())
                    return i;
                if (i + j == haystack.length())
                    return -1;
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
        }
    }
}
