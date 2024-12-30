
/*
Challenge 4: Check if Two Strings are Anagrams
Problem:
Given two strings s and t, write a function to determine if t is an anagram of s.

Example:
Input: String s = "anagram"; String t = "nagaram";
Output: true
*/

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // Your code here
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        s = String.valueOf(sChars);
        System.out.println("s sorted="+s);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        t = String.valueOf(tChars);
        System.out.println("t sorted="+t);

        return s.equals(t);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(sol.isAnagram(s, t));  // Output: true
    }
}
