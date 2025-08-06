package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReplaceAllDotsAndCountWords {
    public static void main(String[] args) {
        //Без привязки к регистру, не учитывать знаки препинания, подсчитать кол-во повторяющихся слов.
        String s = "Привет, как деЛА, мой доБрый, мой милый друг? дела привет!";
        firstSolution(s);
        oneLineSolution(s);
    }

    public static void firstSolution(String s) {
        String[] arr = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            str = str.toLowerCase().replaceAll("[,.?!]", "");
            map.merge(str, 1, Integer::sum);
        }
        System.out.println(map);
    }

    public static void oneLineSolution(String s) {
        Arrays.asList(s.toLowerCase().replaceAll("[,.!?]", "").split(" "))
                .stream().collect(Collectors.toMap(wrd -> wrd, wrd -> 1, Integer::sum))
                .forEach((str, num) -> System.out.println(str + " -> " + num));
    }
}
