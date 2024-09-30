package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 11:10 AM
 */
public class mapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
            if(map.containsKey("a") && map.containsKey("b")) {
                map.put("a", map.get("a"));
                map.put("ab", map.get("a") + map.get("b"));
                map.put("b", map.get("b"));
            } else if (map.containsKey("a")) {

                map.put("a", map.get("a"));
            }else if (map.containsKey("b")) {
                map.put("b", map.get("b"));
            }
        return map;
    }

}
