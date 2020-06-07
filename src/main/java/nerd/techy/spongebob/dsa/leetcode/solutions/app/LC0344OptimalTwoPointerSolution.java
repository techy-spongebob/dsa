package nerd.techy.spongebob.dsa.leetcode.solutions.app;

public class LC0344OptimalTwoPointerSolution {
  public void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;
    while (left < right) {
      char temp = s[right];
      s[right--] = s[left];
      s[left++] = temp;
    }
  }
}
