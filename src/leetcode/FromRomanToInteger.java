package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FromRomanToInteger {

    public static void main(String[] args) {
//        romanReader("MCMXCIV");
        romanReader("III");
    }

    public static void romanReader(String s) {
        Map<String, Integer> converter = new HashMap<>();

        converter.put("I", 1);
        converter.put("V", 5);
        converter.put("X", 10);
        converter.put("L", 50);
        converter.put("C", 100);
        converter.put("D", 500);
        converter.put("M", 1000);

        char[] c = s.toCharArray();
        int result = 0;

        for (int i = 0; i < c.length; i++) {
            if (i + 1 != c.length) {
                if ((c[i] == 'I') && (c[i + 1] == 'V')) {
                    result += 4;
                    i++;
                    continue;
                } else if ((c[i] == 'I') && (c[i + 1] == 'X')) {
                    result += 9;
                    i++;
                    continue;
                } else if ((c[i] == 'X') && (c[i + 1] == 'L')) {
                    result += 40;
                    i++;
                    continue;
                } else if ((c[i] == 'X') && (c[i + 1] == 'C')) {
                    result += 90;
                    i++;
                    continue;
                } else if ((c[i] == 'C') && (c[i + 1] == 'D')) {
                    result += 400;
                    i++;
                    continue;
                } else if ((c[i] == 'C') && (c[i + 1] == 'M')) {
                    result += 900;
                    i++;
                    continue;
                }
            }
            result += converter.getOrDefault(String.valueOf(c[i]), 0);
        }
        System.out.println(result);
    }
}
