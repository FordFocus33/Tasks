package leetcode.easy;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int a = 11;
        System.out.println(hammingWeight(a));
    }

    public static int hammingWeight(int n) {
        String bit = Integer.toBinaryString(n);
        int result = 0;
        char[] chars = bit.toCharArray();

        for (int i = 0; i < bit.length(); i++) {
            if (chars[i] == '1') result++;
        }
        return result;
    }
}
