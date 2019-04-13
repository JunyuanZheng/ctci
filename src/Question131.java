import java.util.ArrayList;
import java.util.List;

public class Question131 {
    private List<List<String>> resultLst;
    private ArrayList<String> currLst;

    public List<List<String>> partition(String s) {
        resultLst = new ArrayList<>();
        currLst = new ArrayList<>();
        backTrack(s, 0);
        return resultLst;
    }

    private void backTrack(String s, int idx) {
        if (s.length() == idx && !currLst.isEmpty()) {
            resultLst.add(new ArrayList<>(currLst));
            return;
        }
        for (int i = idx; i < s.length(); i += 1) {
            if (isPalindrome(s, idx, i)) {
                currLst.add(s.substring(idx, i + 1));
                backTrack(s, i + 1);
                currLst.remove(currLst.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str, int l, int r) {
        if (l == r) return true;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
