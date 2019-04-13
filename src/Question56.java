import common.Interval;

import java.util.ArrayList;
import java.util.List;

public class Question56 {
    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort((i1, i2) -> {
            if (i1.start != i2.start)
                return i1.start - i2.start;
            else
                return i1.end - i2.end;
        });
        List<Interval> result = new ArrayList<>();
        for (Interval interval : intervals) {
            if (result.isEmpty()) {
                result.add(interval);
                continue;
            }
            Interval last = result.get(result.size() - 1);
            if (interval.start <= last.end) {
                last.end = Math.max(last.end, interval.end);
            } else {
                result.add(interval);
            }
        }
        return result;
    }
}
