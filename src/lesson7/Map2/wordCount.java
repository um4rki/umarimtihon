package lesson7.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 1:13 PM
 */
public class wordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            }else {
                int count = map.get(s) ;
                map.put(s, count + 1);
            }
        }
        return map;
    }

}
