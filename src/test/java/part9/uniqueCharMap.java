package part9;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class uniqueCharMap {

    public static void uniqueMapChar(String str){
        Map<String,Integer> uniqueMap = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int count = Collections.frequency((Arrays.asList(str.split(""))),each);
            if(count==1)
                uniqueMap.put(each,count);
        }
        System.out.println("uniqueMap = " + uniqueMap);
    }

    public static void main(String[] args) {
        uniqueMapChar("hello");
    }
}
