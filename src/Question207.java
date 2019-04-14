import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Question207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] map = new int[numCourses][numCourses];
        int[] counter = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            int course1 = prerequisite[0];
            int course2 = prerequisite[1];
            map[course2][course1] = 1;
            counter[course1] += 1;
        }

        int result = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < counter.length; i += 1) {
            if (counter[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()) {
            int idx = queue.poll();
            result += 1;
            for (int j = 0; j < numCourses; j += 1) {
                if (map[idx][j] == 1) {
                    counter[j] -= 1;
                    if (counter[j] == 0)
                        queue.add(j);
                }
            }
        }

        return result == numCourses;
    }
}
