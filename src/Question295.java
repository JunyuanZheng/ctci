import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Question295 {
    /*
    class MedianFinder {
        ArrayList<Integer> list;

        public MedianFinder() {
            this.list = new ArrayList<>();
        }

        public void addNum(int num) {
            this.list.add(num);
        }

        public double findMedian() {
            Collections.sort(list);
            int size = list.size();
            return size % 2 != 0 ? list.get(size / 2) : (double) (list.get(size / 2 - 1) + list.get(size / 2)) / 2;
        }
    }
    */

    /*
    public static class MedianFinder {
        ArrayList<Integer> list;

        public MedianFinder() {
            list = new ArrayList<>();
        }

        public void addNum(int num) {
            int low = 0, high = list.size() - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (list.get(mid) == num) {
                    list.add(mid, num);
                    return;
                } else if (list.get(mid) < num) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
            list.add(low, num);
        }

        public double findMedian() {
            int size = list.size();
            if (size % 2 == 1) {
                return list.get(size / 2);
            } else {
                return (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
            }
        }
    }
    */

    public static class MedianFinder {
        PriorityQueue<Integer> min;
        PriorityQueue<Integer> max;

        /** initialize your data structure here. */
        public MedianFinder() {
            max = new PriorityQueue<>(Comparator.comparingInt(i -> i));
            min = new PriorityQueue<>((i1, i2) -> i2 - i1);
        }

        public void addNum(int num) {
            max.add(num);
            min.add(max.poll());
            while (min.size() > max.size())
                max.add(min.poll());
        }

        public double findMedian() {
            if (min.size() == max.size())
                return (min.peek() + max.peek()) / 2.0;
            return max.peek();
        }
    }
}
