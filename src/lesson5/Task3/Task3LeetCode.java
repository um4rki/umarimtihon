package lesson5.Task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3LeetCode {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        Set<Integer> set = new HashSet<Integer>();
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }

        }

        for (int candy : candies) {
            if(candy + extraCandies >= maxCandies) {
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
}
