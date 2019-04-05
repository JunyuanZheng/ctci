public class Question186 {
    public void reverseWords(char[] str) {
        if (str == null)
            return;
        reverse(str, 0, str.length - 1);
        for (int i = 0; i < str.length; i += 1) {
            char c = str[i];
            if (c == ' ')
                continue;
            int start = i;
            while (i + 1 < str.length && str[i + 1] != ' ') {
                i += 1;
            }
            reverse(str, start, i);
        }
    }

    private void reverse(char[] str, int start, int end) {
        while (start < end) {
            char tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start += 1;
            end -= 1;
        }
    }
}
