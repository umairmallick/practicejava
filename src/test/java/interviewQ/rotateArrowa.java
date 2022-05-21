package interviewQ;

import java.util.Arrays;
import java.util.Collections;

public class rotateArrowa {

    public static int rotate(String s){
        String[] strArr = s.split("");
        int count=0;
        String target = "";
        for (String each : strArr) {
            int freqCount = Collections.frequency(Arrays.asList(strArr), each);

            if (count < freqCount) {
                count = freqCount;
                target = each;
            }
        }

        int count2=0;
            for (String each : strArr) {
                if(!each.equals(target))
                count2++;
            }

            return count2;
        }


    public static void main(String[] args) {
        System.out.println("rotate =" + rotate("v>>>vv"));
    }

}
