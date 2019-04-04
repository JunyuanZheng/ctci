import common.Interval;

import java.util.Arrays;

public class Question253 {
    public int minMeetingRooms(Interval[] intervals) {
        int size = intervals.length;
        if (size == 0)
            // todo: figure out requirements
            return 0;
        int[] starts = new int[size];
        int[] ends = new int[size];
        for (int i = 0; i < intervals.length; i += 1) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int result = 0, startPtr = 0, endPtr = 0;
        while (startPtr < size) {
            if (ends[endPtr] > starts[startPtr]) {
                result += 1;
            } else {
                endPtr += 1;
            }
            startPtr += 1;
        }
        return result;
    }
}
