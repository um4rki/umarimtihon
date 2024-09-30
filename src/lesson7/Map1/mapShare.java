package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 11:07 AM
 */
public class mapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("a",map.get("a"));
            map.put("b",map.get("a"));
            map.remove("c");
        }else {
            map.put("b",map.get("b"));
            map.remove("c");
        }
        return map;
    }
}
