package lesson7.Map1;

import java.util.Map;

/**
 * Created by: Umar
 * DateTime: 8/19/2024 12:31 PM
 */
public class mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        String temp1 = map.get("a");
        String temp2 = map.get("b");

        if(temp1!=null && temp2!=null ) {
            if (temp1.length() != temp2.length()) {
                map.put("c",map.get("a").length()>map.get("b").length()?temp1:temp2);
            }

            if(map.get("a").length()==map.get("b").length()) {
                map.put("a","");
                map.put("b","");
            }
        }

        return map;
    }

}
