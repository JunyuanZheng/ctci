import java.util.Stack;

public class Question150 {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        for (String value : tokens) {
            if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                int v2 = stack.pop();
                int v1 = stack.pop();
                int tmp = 0;
                switch (value) {
                    case "+":
                        tmp = v1 + v2;
                        break;
                    case "-":
                        tmp = v1 - v2;
                        break;
                    case "*":
                        tmp = v1 * v2;
                        break;
                    case  "/":
                        tmp = v1 / v2;
                        break;
                }
                stack.push(tmp);
            } else {
                stack.push(Integer.parseInt(value));
            }
        }
        return stack.pop();
    }
}
