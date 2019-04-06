import java.util.ArrayList;
import java.util.List;

public class Question722 {
    public List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        boolean isBlockCommentDetected = false;
        StringBuilder sb = new StringBuilder();
        for (String s : source) {
            char[] chars = s.toCharArray();
            if (!isBlockCommentDetected)
                sb = new StringBuilder();
            int idx = 0;
            int size = chars.length;
            while (idx < chars.length) {
                if (!isBlockCommentDetected && idx + 1 < size && chars[idx] == '/' && chars[idx + 1] == '*') {
                    isBlockCommentDetected = true;
                    idx += 1;
                } else if (isBlockCommentDetected && idx + 1 < size && chars[idx] == '*' && chars[idx + 1] == '/') {
                    isBlockCommentDetected = false;
                    idx += 1;
                } else if (!isBlockCommentDetected && idx + 1 < size && chars[idx] == '/' && chars[idx + 1] == '/')
                    break;
                else if (!isBlockCommentDetected)
                    sb.append(chars[idx]);
                idx += 1;
            }
            if (!isBlockCommentDetected && sb.length() != 0)
                result.add(sb.toString());
        }
        return result;
    }
}