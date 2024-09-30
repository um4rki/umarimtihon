package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 11:00 AM
 */
public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")){

            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;

    }
}
