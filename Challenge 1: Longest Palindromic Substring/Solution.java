/*
Challenge 1: Longest Palindromic Substring
Problem:
Given a string s, return the longest palindromic substring in s.

Example:
Input: String s = "babad";
Output: "bab" or "aba"
*/

public class Solution {
    public String longestPalindrome(String s) {
        // Your code here
        if (s.isEmpty()){
            return s;
        }
        int n = s.length();
        int start = 0;
        int end = n-1;
        String result = "";
        while (end > start) {
            if (s.charAt(start) == s.charAt(end)){
                result = s.substring(start, end+1);
            }
            start++;
            end--;
        }
        return result;
    }
   
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "babad";
        System.out.println(sol.longestPalindrome(s));  // Output: "bab" or "aba"
    }
}