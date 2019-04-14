import java.util.Stack;

public class Question402 {
    /*
    public String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";
        int counter = 0;
        int size = num.length();
        char[] c = num.toCharArray();
        for (int i = 0; i < k; i += 1) {
            for (int j = 0; j < size - counter - 1; j += 1) {
                if (c[j] > c[j + 1]) {
                    remove(c, j);
                    break;
                }

            }
            for (int j = size - counter - 1; j < size; j += 1) {
                c[j] = 0;
            }
            counter += 1;
        }
        int index = 0;
        for (char n : c) {
            if (n != '0') {
                break;
            } else {
                index += 1;
            }
        }
        return index == size - k - 1 ? "0" : new String(c, index, num.length() - k - index);
    }

    private void remove(char[] chars, int idx) {
        for (int i = idx; i < chars.length - 1; i += 1) {
            chars[i] = chars[i + 1];
        }
    }
    */

    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i += 1) {
            char c = num.charAt(i);
            while (!stack.isEmpty() && c < stack.peek() && k > 0) {
                stack.pop();
                k -= 1;
            }
            stack.push(c);
        }
        while (k > 0) {
            stack.pop();
            k -= 1;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.insert(0, stack.pop());
        String s = sb.toString();
        int idx = 0;
        while (idx < s.length() && s.charAt(idx) == '0')
            idx += 1;
        return idx == s.length() ? "0" : s.substring(idx);
    }
}
