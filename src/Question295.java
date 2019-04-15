import java.util.ArrayList;
import java.util.Collections;

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
}
