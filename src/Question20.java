import java.util.Stack;

public class Question20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || c != stack.pop())
                    return false;
            } else {
                switch (c) {
                    case '(':
                        stack.push(')');
                        break;
                    case '[':
                        stack.push(']');
                        break;
                    case '{':
                        stack.push('}');
                        break;
                }
            }
        }
        return stack.isEmpty();
    }
}
