package linkedList;

import java.util.Arrays;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] mas1 = {2,4,3};
        int[] mas2 = {5,6,4};
        System.out.println(result(mas1, mas2));
    }

    public static int result(int[] mas1, int[] mas2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        Arrays.stream(mas1).forEach(str1::append);
        Arrays.stream(mas2).forEach(str2::append);

        str2.reverse();
        str1.reverse();

        return Integer.parseInt(str1.toString()) + Integer.parseInt(str2.toString());
    }
}
