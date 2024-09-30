package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 11:47 AM
 */
public class topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            map.put("potato", map.get("potato"));
            map.put("fries",map.get("potato"));
        } else if (map.containsKey("potato") && map.containsKey("salad")) {

            map.put("potato", map.get("potato"));
            map.put("fries",map.get("potato"));
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

}
