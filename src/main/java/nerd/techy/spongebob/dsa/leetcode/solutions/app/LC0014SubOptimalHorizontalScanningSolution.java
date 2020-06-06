package nerd.techy.spongebob.dsa.leetcode.solutions.app;

/*
 * Problem: 
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * Input: ["flower","flow","flight"] Output: "fl" Example 2:
 * 
 * Input: ["dog","racecar","car"] Output: "" Explanation: There is no common prefix among the input
 * strings. Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 * Solution:
 * Horizontal Scanning
 * 
 * Time Complexity: 
 *      Best Case: When the second word is different, O(l) where l is the length of the first word.
 *      Worst Case: When all words are same, O(l*m) where l is the maximum length of a word and 
 *      m is number of words
 * 
 * Space Complexity: O(1)
 */

public class LC0014SubOptimalHorizontalScanningSolution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0) {
            return "";
        }
        
        int size = strs.length;
        String prefix = strs[0];
        int prefixLength = prefix.length();
        
        for(int i=1; i<size; i++) {
            
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, --prefixLength);
                if(prefixLength == 0) return "";
            }
            
        }
        
        return prefix;
        
    }
}