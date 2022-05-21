package part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class concatTwoStringArr {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(StringArray()));
    }

    public static String [] StringArray(){
        String str1[] = { "A", "E", "I" };          //source array
        String str2[] = { "O", "U" };               //destination array
        String str3[] = new String[str1.length+str2.length];
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str1));
        list.addAll(Arrays.asList(str2));
        int count = 0;
        for (String each : list) {
            str3[count++]=each;
        }


        return str3;

    }

}
