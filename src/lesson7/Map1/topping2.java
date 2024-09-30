package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 11:33 AM
 */
public class topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream", map.get("ice cream"));
            map.put("yogurt",map.get("ice cream"));
        } else if (map.containsKey("ice cream")&&map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}
