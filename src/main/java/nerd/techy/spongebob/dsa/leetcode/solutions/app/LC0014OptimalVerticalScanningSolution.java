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
 * Solution: Vertical Scanning
 *
 * Time Complexity: Best Case: there are at most n * minLen comparisons where minLen is the length
 * of the shortest string in the array. Worst Case: When all words are same, O(S) where S is the sum
 * of all characters in the input array.
 *
 * Space Complexity: O(1)
 */
public class LC0014OptimalVerticalScanningSolution {
  public String longestCommonPrefix(String[] strs) {

    if (strs == null || strs.length == 0) {
      return "";
    }

    int n = strs[0].length();

    for (int i = 0; i < n; i++) {
      char ch = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i == strs[j].length() || ch != strs[j].charAt(i)) {
          return strs[0].substring(0, i);
        }
      }
    }

    return strs[0];
  }
}
