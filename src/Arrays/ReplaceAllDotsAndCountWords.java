package Arrays;

import java.util.HashMap;

public class ReplaceAllDotsAndCountWords {
    public static void main(String[] args) {
        //Без привязки к регистру, не учитывать знаки препинания, подсчитать кол-во повторяющихся слов.
        String s = "Привет, как деЛА, мой доБрый, мой милый друг? дела привет!";
        String[] arr = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            str = str.toLowerCase().replaceAll("[,.?!]", "");
            map.merge(str, 1, Integer::sum);
        }
        System.out.println(map);
    }
}
