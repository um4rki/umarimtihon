package lesson7.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 2:43 PM
 */
public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            if(s!=null &&!s.isEmpty()){
                String firstChar = s.substring(0, 1);
                map.put(firstChar, map.getOrDefault(firstChar, "") + s);
            }
        }
        return map;
    }

}
