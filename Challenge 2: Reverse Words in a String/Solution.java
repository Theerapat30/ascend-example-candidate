/*
Challenge 2: Reverse Words in a String
Problem:
Given an input string s, reverse the order of the words.

Example:
Input: String s = "the sky is blue";
Output: "blue is sky the"
*/
public class Solution {
    public String reverseWords(String s) {
        // Your code here
        if (s.isEmpty()){
            return s;
        }
        String[] words = s.split(" ");
        String result = "";
        for(int i = words.length-1; i >= 0; i--){
            if (words[i].trim().isEmpty()){
                continue;
            }
            result = result.concat(words[i]).concat(" ");
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "the sky is blue";
        System.out.println(sol.reverseWords(s));  // Output: "blue is sky the"
    }
}
