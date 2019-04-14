public class Question443 {
    public int compress(char[] chars) {
        int size = 0;
        for (int i = 0; i < chars.length; i += 1) {
            int start = i;
            while (i + 1 < chars.length && chars[i + 1] == chars[i]) {
                i += 1;
            }
            chars[size++] = chars[start];
            if (i - start + 1 != 1) {
                for(char c : Integer.toString(i - start + 1).toCharArray())
                    chars[size++] = c;
            }
        }
        return size;
    }
}
