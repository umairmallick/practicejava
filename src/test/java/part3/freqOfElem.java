package part3;

import java.util.*;

public class freqOfElem {

    public static void main(String[] args) {
        Integer[] as={2,1,4,5,1,2,6,8,4,5,2,1,6,3};
        String container = "";
        for (Integer each : as) {
            if(container.contains((each+""))) continue;
            int  count = Collections.frequency(Arrays.asList(as),each);
          container+=""+each;

            System.out.println(each+ "is "+ count+" times");
        }

        String str = "ello";
        String result="";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) count++;
            }
            if(!result.contains(""+str.charAt(i))) result+=str.charAt(i)+" is "+count+" times\n";
        }

    }

}
