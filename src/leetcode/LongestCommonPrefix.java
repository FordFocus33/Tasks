package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flight","flower","flow"};
        longestPrefix(strings);
    }

    //Код шляпа, но прошел
    public static void longestPrefix(String[] str) {
        StringBuilder result = new StringBuilder(str[0]);
        for (int i = 0; i < str.length; i++) {
            char[] res = result.toString().toCharArray();
            char[] mas = str[i].toCharArray();
            result.replace(0, result.length(), "");
            int calc = Math.min(res.length, mas.length);
            for (int j = 0; j < calc; j++) {
                if (res[j] != mas[j]) {
                    if (j == 0) {
                        result = new StringBuilder();
                    }

                    break;
                } else result.append(res[j]);
            }
        }
        System.out.println(result);
    }
}
