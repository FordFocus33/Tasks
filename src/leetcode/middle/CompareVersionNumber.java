package leetcode.middle;

import java.util.Arrays;

public class CompareVersionNumber {
    public static void main(String[] args) {
        String ver1 = "1.0.1";
        String ver2 = "1";
        System.out.println(compareVersion(ver1, ver2));
    }

    public static int compareVersion(String version1, String version2) {
        int[] mas1 = baby(version1);
        int[] mas2 = baby(version2);

        int way = Math.max(mas1.length, mas2.length);

        for (int i = 0; i < way; i++) {
            int a = 1 < mas1.length ? mas1[i] : 0;
            int b = 1 < mas2.length ? mas2[i] : 0;

            if (a != b) {
                return a > b ? 1 : -1;
            }
        }
        return 0;
    }

    public static int[] baby(String text) {
        String[] parts = text.split("\\.");
        int[] mas = new int[parts.length];
        int step = 0;
        for (int i = 0; i < parts.length; i++) {
            mas[step] = Integer.parseInt(parts[i]);
        }
        return mas;
    }
}
