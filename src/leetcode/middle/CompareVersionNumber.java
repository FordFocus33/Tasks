package leetcode.middle;

import java.util.Arrays;

public class CompareVersionNumber {
    public static void main(String[] args) {
        String ver1 = "1.0.1";
        String ver2 = "1";
        System.out.println(calculateBigger(ver1, ver2));
    }

    public static int calculateBigger(String version1, String version2) {
        int[] firstMas = {};
        int[] secondMas = {};
        String hub = "";
        for (int i = 0; i < version1.length(); i++) {
            if (version1.charAt(i) == '.') {
                int oldLength = firstMas.length;
                firstMas = Arrays.copyOf(firstMas, firstMas.length + 1);
                firstMas[oldLength] = Integer.parseInt(hub);
                hub = "";
            } else if (version1.length() - 1 == i) {
                hub += version1.charAt(i);
                int oldLength = firstMas.length;
                firstMas = Arrays.copyOf(firstMas, firstMas.length + 1);
                firstMas[oldLength] = Integer.parseInt(hub);
                hub = "";
            } else {
                hub += version1.charAt(i);
            }
        }

        for (int i = 0; i < version2.length(); i++) {
            if (version2.charAt(i) == '.') {
                int oldLength = secondMas.length;
                secondMas = Arrays.copyOf(secondMas, secondMas.length + 1);
                secondMas[oldLength] = Integer.parseInt(hub);
                hub = "";
            } else if (version2.length() - 1 == i) {
                hub += version2.charAt(i);
                int oldLength = secondMas.length;
                secondMas = Arrays.copyOf(secondMas, secondMas.length + 1);
                secondMas[oldLength] = Integer.parseInt(hub);
            } else {
                hub += version2.charAt(i);
            }
        }
        int stepFirst = 0;
        int secondStep = 0;

        while (stepFirst < firstMas.length && secondStep < secondMas.length) {
            if (firstMas[stepFirst] > secondMas[secondStep]) return 1;
            else if (firstMas[stepFirst] < secondMas[secondStep]) return -1;
            else {
                if (stepFirst < firstMas.length) stepFirst++;
                if (secondStep < secondMas.length) secondStep++;
            }
        }
        return 0;
    }
}
