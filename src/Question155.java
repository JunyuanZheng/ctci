import java.util.Stack;

public class Question155 {
    class MinStack {
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack;

        public MinStack() {
            this.stack = new Stack<>();
        }

        public void push(int x) {
            if (x < min) {
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }

        public void pop() {
            int value = stack.pop();
            if (value == min) {
                min = stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }
}
