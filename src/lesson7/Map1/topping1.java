package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 11:27 AM
 */
public class topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
            map.put("bread","butter");
        }else {
            map.put("bread","butter");
        }

        return map;
    }

}
