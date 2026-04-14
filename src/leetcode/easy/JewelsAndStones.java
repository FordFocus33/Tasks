package leetcode.easy;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        if (jewels.isEmpty() || stones.isEmpty()) return 0;
        int res = 0;
        char[] charsJ = jewels.toCharArray();
        char[] charsS = stones.toCharArray();
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (charsJ[i] == charsS[j]) res++;
            }
        }
        return res;
    }
}
