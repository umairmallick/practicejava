package interviewQ;

import java.util.Arrays;

public class leftRotateString {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft("abwc", 1)));

    }


    public static String[] rotateLeft(String s , int times){
        String[] a = s.split("");//splits string into an array
        int count = 0;
        //loop for to iterate number of times its asked for
       while (count!=times) { //0=2
           //stores the first letter of the array
           String ans = a[0];
           for (int i = 0; i < a.length - 1; i++) {
               a[i] = a[i + 1];//(a<-b,b<-w,w<-c)
           }
           a[a.length-1]=ans;//(bwc<-a = bwca)
           count++;
       }
        return a;
    }


}
