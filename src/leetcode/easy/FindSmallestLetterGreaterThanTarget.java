package leetcode.easy;

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] masChar = {'c','f','j'};
        char target = 'a';
        System.out.println(next(masChar, target));
    }

    public static char next(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]) return letters[i];
        }
        return letters[0];
    }
}
