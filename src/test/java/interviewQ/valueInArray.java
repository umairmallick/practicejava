package interviewQ;

import java.util.ArrayList;
import java.util.Arrays;

public class valueInArray {

    /*
 * Given 2 arrays. They are consist of non empty strings. Write a function to find out all elements appear in first array but not in second array.
  Sample input:
    Array A: ["one", "two", "four", "ten"]
    Array B: ["one", "four", "seven", "six"]
  Sample output:
    In A not in B: ["two", "ten"]
    In B not in A: ["seven", "six"]
     */

    public static void main(String[] args) {
        String[] a = {"one", "two", "four", "ten"};
        String[] b = {"one", "four", "seven", "six"};
        ArrayList<String> ANotinB = new ArrayList<>();
        ArrayList<String> ANotinA = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int countA=0;
            int countB=0;
            for (int j = 0; j < b.length; j++) {
                if(a[i]!=b[j]) countA++;
                if(b[i]!=a[j]) countB++;
            }
            if(countA==4) ANotinB.add(a[i]);
            if(countB==4) ANotinA.add(b[i]);
        }

        System.out.println("A not in B:"+ANotinB);
        System.out.println("B not in A:"+ANotinA);

    }

}
