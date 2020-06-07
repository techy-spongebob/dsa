package nerd.techy.spongebob.dsa.leetcode.solutions.app;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of size n, find the majority element. The majority element is the element that
 * appears more than n/2 times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

public class LC00169OptimalHashMapSolution {
  public int majorityElement(int[] nums) {

    Map<Integer, Integer> numMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int count = numMap.getOrDefault(nums[i], 0) + 1;
      if (count > nums.length / 2) {
        return nums[i];
      }
      numMap.put(nums[i], count++);
    }

    return 0;
  }
}
