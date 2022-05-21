package part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class anagram {

    public static void main(String[] args) {

        String a = "abc", b = "caba";
        System.out.println(isAnagram(a, b));
    }

    public static boolean isAnagram(String a, String b){
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(a.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(b.split("")));
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2)) return true;
        return false;
    }


}
