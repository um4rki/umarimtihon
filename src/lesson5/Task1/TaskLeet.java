package lesson5.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskLeet {
    public int sumOfUnique(int[] nums) {

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.add(nums[i])){
                list.add(nums[i]);
            }else {
                list.remove((Integer) nums[i]);
            }
        }

        int sum = 0;
        for(Integer num : nums){
            sum += num;
        }
        return sum;

    }
}
