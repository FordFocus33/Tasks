package leetcode.easy;

import java.util.*;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 *
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 *
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {

    public static void main(String[] args) {
        String note = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(note, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] mas = new int[26];
        for (char c : magazine.toCharArray()) {
            mas[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--mas [c - 'a'] < 0) return false;
        }

        return true;
    }
}
