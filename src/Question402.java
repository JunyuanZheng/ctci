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
        int size = num.length();
        int digits = num.length() - k;
        char[] chars = new char[size];
        int tip = 0;
        for (int i = 0; i < size; i += 1) {
            char c = num.charAt(i);
            while (tip > 0 && chars[tip - 1] > c && k > 0) {
                tip -= 1;
                k -= 1;
            }
            chars[tip] = c;
            tip += 1;
        }
        int counter = 0;
        while (counter < digits && chars[counter] == '0') counter += 1;
        return counter == digits ? "0" : new String(chars, counter, digits - counter);
    }
}
