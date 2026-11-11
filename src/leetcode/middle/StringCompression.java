package leetcode.middle;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int count = 1;
        char previous = chars[0];
        int step = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == previous) count++;
            else {
                chars[step++] = previous;
                if (count > 1) {
                    step = sadItachi(count, step, chars);
                }
                previous = chars[i];
                count = 1;
            }
        }

        chars[step++] = previous;
        if (count > 1) {
            step = sadItachi(count, step, chars);
        }

        return step;
    }

    public static int sadItachi(int count, int step, char[] chars) {
        String countString = String.valueOf(count);

        for (char c : countString.toCharArray()) {
            chars[step++] = c;
        }

        return step;
    }
}

/*
Вариант от гптхи
public static int compress(char[] chars) {
    int read = 0;
    int write = 0;

    while (read < chars.length) {
        char current = chars[read];
        int count = 0;

        // Считаем количество одинаковых символов
        while (read < chars.length && chars[read] == current) {
            read++;
            count++;
        }

        // Записываем символ
        chars[write++] = current;

        // Записываем количество
        if (count > 1) {
            for (char digit : String.valueOf(count).toCharArray()) {
                chars[write++] = digit;
            }
        }
    }

    return write;
}
 */
