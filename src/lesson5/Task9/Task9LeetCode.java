package lesson5.Task9;

import java.util.HashSet;
import java.util.Set;

public class Task9LeetCode {
    public int countConsistentStrings(String allowed, String[] words) {

        Set<Character> set = new HashSet<>();

        for(char c : allowed.toCharArray()) {
            set.add(c);
        }

        int count =0 ;


        for(String word : words) {
            boolean isConsistent = true;

            for(char c : word.toCharArray()) {
                if(!set.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }

            if(isConsistent) {
                count++;
            }
        }



        return count;

    }
}
