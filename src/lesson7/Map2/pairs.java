package lesson7.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 1:06 PM
 */
public class pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String string : strings) {
            map.put(string.charAt(0)+"" , string.charAt(string.length()-1) +"");
        }
        return map;
    }

}
