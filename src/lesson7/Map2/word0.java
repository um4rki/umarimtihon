package lesson7.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 1:03 PM
 */
public class word0 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s,0);
        }
        return map;
    }

}
