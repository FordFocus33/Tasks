package leetcode.easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "race a car";
        System.out.println(calculate(str));
    }

    public static boolean calculate(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char first = s.charAt(left);
            char second = s.charAt(right);

            if (!Character.isLetterOrDigit(first)) {
                left++;
            }
            else if (!Character.isLetterOrDigit(second)) {
                right--;
            }
            else if (Character.toLowerCase(first) != Character.toLowerCase(second)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
