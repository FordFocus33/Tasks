package leetcode.middle;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        System.out.println(combine(n,k));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        takeOff(result, new ArrayList<>(), n, k, 1);
        return result;
    }

    public static void takeOff(List<List<Integer>> list, List<Integer> current, int n, int k, int start) {
        if (current.size() == k) {
            list.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            takeOff(list, current,n, k,i + 1);
            current.removeLast();
        }
    }
}
