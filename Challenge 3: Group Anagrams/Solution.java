/*
Challenge 3: Group Anagrams
Problem:
Given an array of strings, group anagrams together.

Example:
Input: String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
*/
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Your code here
        List<List<String>> result = new ArrayList();
        if (strs == null){
            return result;
        }

        Map<String, List<String>> strMap = new HashMap<>();
        
        for (String s : strs){
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String key = String.copyValueOf(cs);
            if (!strMap.containsKey(key)){
                strMap.put(key, new ArrayList<>());
            }
            strMap.get(key).add(s);
        }
        return new ArrayList<>(strMap.values());
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(sol.groupAnagrams(strs));  // Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
    }
}
