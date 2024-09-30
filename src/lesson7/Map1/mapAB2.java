package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 12:11 PM
 */
public class mapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        String temp1 = map.get("a");
        String temp2 = map.get("b");

        if(temp1 != null && temp2!= null && temp1.equals(temp2)){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }


}
