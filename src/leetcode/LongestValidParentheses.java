package leetcode;

import java.util.Stack;


/**
 * Мы используем стек для отслеживания индексов несовпадающих «(».
 Записывая также индекс последнего несовпадающего «)»,
 мы можем вычислить длину каждой допустимой подстроки
 и отслеживать максимальную найденную длину.
 */

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "))())";
        System.out.println(maxLength(s));
    }

    static int maxLength(String s) {
        Stack<Integer> st = new Stack<>();

        st.push(-1);
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            }
            else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }

        return maxLen;
    }

}
