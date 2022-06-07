package interviewQ;

import java.util.*;

public class occurence {

    public static void main(String []args) {
        String[] testArray = {"appLe", "b at", "A53 PPle", ""};

        List<String> temp = new ArrayList<>();
        for (String each : testArray) {
            each=each.replaceAll("[^a-zA-Z]","");
            each=each.replace(" ","");
            temp.add(each.toLowerCase());
        }

        for (String s : new LinkedHashSet<>(temp)) {
            System.out.println(s +"="+ Collections.frequency(temp, s) );
        }

    }


    
}
