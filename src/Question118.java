import java.util.ArrayList;
import java.util.List;

public class Question118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0)
            return result;
        for (int i = 0; i < numRows; i += 1) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j += 1) {
                if (j == 0 || j == i)
                    list.add(1);
                else {
                    List<Integer> pre = result.get(i - 1);
                    list.add(pre.get(j - 1) + pre.get(j));
                }
            }
            result.add(list);
        }
        return result;
    }
}
