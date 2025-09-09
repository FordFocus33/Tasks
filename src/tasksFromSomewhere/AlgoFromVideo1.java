package tasksFromSomewhere;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

/**
 * На вход приходит строка, с произвольной длинной и разными символами.
 * Нужно вернуть первый уникальный (т.е. неповторяющийся) символ из строки.
 */
public class AlgoFromVideo1 {

    public static Character findFirstUniqueLetter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character character : str.toCharArray()) {
            map.put(character, map.containsKey(character) ? 0 : 1);
        }
        return map.entrySet().stream().filter(s -> s.getValue().equals(1)).map(Map.Entry::getKey).findFirst().orElseThrow(NoSuchElementException::new);
    }

    public static void main(String[] args) {
        String str = "baby put me on";
        System.out.println(findFirstUniqueLetter(str));
    }
}
