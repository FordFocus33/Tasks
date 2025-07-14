package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
     int[] arr = {1,2,1,2,5,8,2,8};
        System.out.println(answer(arr));
    }

    public static int answer(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], false);
            } else {
                map.put(arr[i], true);
            }
        }

        return map.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .toList().getFirst();
    }
}
