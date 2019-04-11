import common.NestedInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Question341 {
    public class NestedIterator implements Iterator<Integer> {
        Stack<NestedInteger> stack;

        public NestedIterator(List<NestedInteger> nestedList) {
            this.stack = new Stack<>();
            for(int i = nestedList.size() - 1; i >= 0; i--)
                stack.push(nestedList.get(i));
        }

        @Override
        public Integer next() {
            return stack.pop().getInteger();
        }

        @Override
        public boolean hasNext() {
            while (!stack.isEmpty()) {
                if (stack.peek().isInteger())
                    return true;
                NestedInteger ni = stack.pop();
                for(int i = ni.getList().size() - 1; i >= 0; i--) {
                    stack.push(ni.getList().get(i));
                }
            }
            return false;
        }
    }
}
