package lesson5.Task6;

public class Task6LeetCode {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        arithmeticTriplets(arr , 2);
    }
    public static int arithmeticTriplets(int[] nums, int diff) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] - nums[i] == diff) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;


    }
}
