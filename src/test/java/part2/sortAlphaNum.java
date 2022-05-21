package part2;

import java.util.Arrays;
import java.util.Collections;

public class sortAlphaNum {

    public static void main(String[] args){

        String input= "DC501GCCCA098911AB";
        String newStr ="";

        for (int i = 0; i < input.length()-1; i++) {
            if((Character.isDigit(input.charAt(i)) && Character.isLetter(input.charAt(i+1))) ||
                    (Character.isDigit(input.charAt(i+1)) && Character.isLetter(input.charAt(i)))){
                newStr+=input.charAt(i)+" ";
            }
            else
            newStr+=input.charAt(i);
        }
        newStr+=input.charAt(input.length()-1);

        String[] arr = newStr.split(" ");
        String result = "";
        for (String each : arr) {
            char[] chArr = each.toCharArray();
            Arrays.sort(chArr);
            for (char c : chArr) {
            result+=c;
            }
        }
        System.out.println(result);


    }

}
