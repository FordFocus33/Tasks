package leetcode;

import java.time.LocalDateTime;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.reverse();
        int reversedX = Integer.parseInt(sb.toString());

        return reversedX == x;
    }
}
