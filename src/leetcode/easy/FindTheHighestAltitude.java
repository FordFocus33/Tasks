package leetcode.easy;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAttitude(gain));
    }

    public static int largestAttitude(int[] gain) {
        int start = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            start += gain[i];
            max = Math.max(max, start);
        }
        return max;
    }
}
