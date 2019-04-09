import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;
        Set<String> reached = new HashSet<>();
        reached.add(beginWord);
        int distance = 1;
        while (!reached.contains(endWord)) {
            Set<String> toAdd = new HashSet<>();
            for (String s : reached) {
                char[] chars = s.toCharArray();
                for (int i = 0; i < s.length(); i += 1) {
                    for (char ch = 'a'; ch <= 'z'; ch += 1) {
                        char tmp = chars[i];
                        chars[i] = ch;
                        String word = new String(chars);
                        if (wordList.contains(word)) {
                            toAdd.add(word);
                            wordList.remove(word);
                        }
                        chars[i] = tmp;
                    }
                }
            }
            distance += 1;
            if (toAdd.size() == 0)
                return 0;
            reached = toAdd;
        }
        return distance;
    }
}
