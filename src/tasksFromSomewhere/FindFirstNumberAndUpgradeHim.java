package tasksFromSomewhere;

import java.time.LocalDate;
import java.util.stream.IntStream;

/**
 * Нужно найти первую цифру в строке и увеличить её на 1
 */
public class FindFirstNumberAndUpgradeHim {
    private static final String a1 = "16d";
    private static final String a = "a96d";

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(a);
        int step = IntStream.range(0, a.length())
                .filter(s -> Character.isDigit(a.charAt(s)))
                .findFirst()
                .orElse(-1);

        int concatNumber = Character.getNumericValue(a.charAt(step)) + 1;
        stringBuilder.replace(step, step + 1, String.valueOf(concatNumber));
        System.out.println(stringBuilder);
    }
}
