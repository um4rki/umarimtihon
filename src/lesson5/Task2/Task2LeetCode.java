package lesson5.Task2;

import java.util.HashSet;
import java.util.Set;

public class Task2LeetCode {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (complement == nums[j]) {
                    set.add(i);
                    set.add(j);
                    break;
                }
            }
        }
        return set.stream().mapToInt(i -> i).toArray();
    }
}
