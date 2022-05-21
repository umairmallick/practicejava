package interviewQ;

import java.util.Arrays;
import java.util.Collections;

public class getFirstUniqueCharacter {

    public static void main(String[] args) {
        String str = "falafal";
        System.out.println("Ans "+firstUnique(str));
    }

    public static int firstUnique(String str){
        int index =0;
        String[] arrStr = str.split("");
        int count=0;
        for (String each : arrStr) {
             count = Collections.frequency(Arrays.asList(arrStr),each);
            if(count==1){
                index=str.indexOf(each);
                break;
            }
        }
        if(count!=1) return -1;
        System.out.println(index);

        return index+1;
    }

}
