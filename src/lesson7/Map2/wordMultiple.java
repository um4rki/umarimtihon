package lesson7.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 3:26 PM
 */
public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            }else {
                map.put(s, true);
            }
        }
        return map;
    }
}
