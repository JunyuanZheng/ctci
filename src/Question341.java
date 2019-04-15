import common.NestedInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Question341 {
    public class NestedIterator implements Iterator<Integer> {
        Stack<NestedInteger> stack;

        public NestedIterator(List<NestedInteger> nestedList) {
            stack = new Stack<>();
            for (int i = nestedList.size() - 1; i >= 0; i -= 1) {
                stack.push(nestedList.get(i));
            }
        }

        @Override
        public Integer next() {
            return stack.pop().getInteger();
        }

        @Override
        public boolean hasNext() {
            while (!stack.isEmpty()) {
                NestedInteger nestedInteger = stack.peek();
                if (nestedInteger.isInteger())
                    return true;
                List<NestedInteger> list = stack.pop().getList();
                for (int i = list.size() - 1; i >= 0; i -= 1) {
                    stack.push(list.get(i));
                }
            }
            return false;
        }
    }
}
