package lesson5.Task8;

public class Task8LeetCode {
    public boolean checkIfPangram(String sentence) {
        boolean[] isPangram = new boolean[26];
        int counter = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            int index = ch - 'a';

            if (!isPangram[index]) {
                isPangram[index] = true;
                counter++;
            }

            if(counter == 26) {
                return true;
            }
        }

        return false;
    }
}
