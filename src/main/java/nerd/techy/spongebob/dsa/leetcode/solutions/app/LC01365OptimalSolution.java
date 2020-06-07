package nerd.techy.spongebob.dsa.leetcode.solutions.app;

/*
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than
 * it. That is, for each nums[i] you have to count the number of valid j's such that j != i and
 * nums[j] < nums[i].
 *
 * Return the answer in an array.
 */

public class LC01365OptimalSolution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }

    int[] count = new int[101];
    int[] sum = new int[101];
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      count[nums[i]]++;
    }

    for (int i = 1; i < 101; i++) {
      sum[i] = count[i - 1] + sum[i - 1];
    }

    for (int i = 0; i < nums.length; i++) {
      result[i] = sum[nums[i]];
    }

    return result;
  }
}
