package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 12:20 PM
 */
public class mapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b")){
            map.put("a", map.get("a"));
            map.put("b", map.get("a"));
            map.put("c", map.get("c"));
        }if(map.containsKey("b") && !map.containsKey("a")){
            map.put("b", map.get("b"));
            map.put("c", map.get("c"));
            map.put("a", map.get("b"));
        }
        return map;
    }

}
