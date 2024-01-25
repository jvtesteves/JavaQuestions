/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // First we create a map
        HashMap<Integer, Integer> map = new HashMap<>();

        // Second we iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Now we calculate the complement (the number missing to the current value reaches the target)
            int complement = target - nums[i];

            // Now we check if the map already contains the complement
            if (map.containsKey(complement)) {
                // If the complement is found, return the current index and the complement's index
                return new int[] { i, map.get(complement)};
            }

            // If the complement is not found, put the current value and its index in the map
            map.put(nums[i], i);
        }

        // JUst in case we don't find any solution
        return null;
    }
}
