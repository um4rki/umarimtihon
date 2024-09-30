package lesson7.Map2;

import java.util.HashMap;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 3:02 PM
 */
public class wordAppend {
    public String wordAppend(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
                if (map.get(s) != 1 && map.get(s) % 2 == 0) {
                    res.append(s);
                }
            }
        }
        return res.toString();
    }
}
