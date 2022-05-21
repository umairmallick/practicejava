package part9;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class freqofCharMaps {

    public static void main(String[] args) {
        String a = "Hello";
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String each : a.split("")) {
            map.put(each, Collections.frequency(Arrays.asList(a.split("")),each));
        }

        System.out.println(map);
    }

}
