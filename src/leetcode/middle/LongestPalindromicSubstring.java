package leetcode.middle;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String a = "abadbs";
        System.out.println(bambarmia(a));
    }

    public static String bambarmia(String string) {
        int maxLength = 1;
        int start = 0;

        int n = string.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (kergudu(string, i, j) && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return string.substring(start, start + maxLength);
    }

    public static Boolean kergudu(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            high--;
            low++;
        }
        return true;
    }
}
