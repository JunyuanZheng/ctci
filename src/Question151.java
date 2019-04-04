import java.util.ArrayList;
import java.util.List;

public class Question151 {
    // edge case: " "
    // edge case ""
    // edge case "    "
    // edge case "a"
    // edge case null ?
    public String reverseWords(String s) {
        if (s == null)
            // todo: figure out the requirements
            return null;
        List<String> list = new ArrayList<>();
        for (int i = s.length() -1; i >=0; i -= 1) {
            if (s.charAt(i) == ' ')
                continue;
            int end = i + 1;
            while (i >=0 && s.charAt(i) != ' ') {
                i -= 1;
            }
            list.add(s.substring(i + 1, end));
        }
        return String.join(" ", list);
    }
}
