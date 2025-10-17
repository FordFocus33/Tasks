package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        emotion(2, 0, 0, "");
        System.out.println(result);
    }

    public static void emotion(int pairCount, int openCount, int closeCount, String current) {
        if (openCount > pairCount || closeCount > pairCount || closeCount > openCount) {
            return;
        }
        if (pairCount == openCount && pairCount == closeCount) {
            result.add(current);
        } else {
            emotion(pairCount, openCount + 1, closeCount, current + "(");
            emotion(pairCount, openCount, closeCount + 1, current + ")");
        }
    }
}
