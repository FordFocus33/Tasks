package leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XLVI";
        System.out.println(convert(s));
    }

    public static int convert(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int first = map.get(chars[i]);
            if (i == chars.length - 1) result += first;
            else {
                int second = map.get(chars[i + 1]);
                if (first < second) {
                    result += second - first;
                    i++;
                } else {
                    result += first;
                }
            }
        }
        return result;
    }
}
