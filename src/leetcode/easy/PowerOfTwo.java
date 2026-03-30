package leetcode.easy;

/**
 * Description
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 *
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isPowerOfTwo(n));
    }

    /**
     * Как решать?
     *
     * Оператор & в Java — это побитовое И (bitwise AND).
     *
     * Он сравнивает каждый бит двух чисел:
     *
     * если оба бита = 1 → результат 1
     * иначе → 0
     *
     * Вот рабочие и правильные решения (везде после суммирования должны остаться 0000):
     * 8 = 1000, and 8 - 1 = 7 = 0111 - тут если сложить будет 0000 - For 8: 1000 & 0111 = 0000
     * 16 = 10000, and 16 - 1 = 15 = 01111
     * 4 = 0100, and 4 - 1 = 3 = 0011
     *
     * Вот решения, где будет неправильно и вернется ложь:
     * 5  = 0101
     * 4  = 0100
     * -----------
     * &  = 0100  (это 4)
     *
     */
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
