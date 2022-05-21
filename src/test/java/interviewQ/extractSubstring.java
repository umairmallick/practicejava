package interviewQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class extractSubstring {
/*
 *  Extract Substring
1. Given a string s, count the number of substrings "asd"


Example 1:
Input: s = "nnnasdfffasdiiiiasg ffasdfg"
Output: 3

 */
        public static void main(String[] args) {
            System.out.println(longestPalindrome("ffasdfgasd"));
            System.out.println(longestPalindrome("nnnasdifffasdiiiiasg ffasdfgasdasd"));
            System.out.println(longestPalindrome("nnnasdifffasdiiiiasg ffasdfgasdasd"));
        }
         public static int longestPalindrome(String a) {
             int c =0;
             int b ="asd".length();
             //this will replace spaces from the string and change it to lower case
             String str = a.toLowerCase().replace(" ","");
             for (int i = 0; i < str.length(); i++) {
                 for (int j = i+(b-1); j <= str.length(); j++) {//j=i+2 thats specify the length of substring
                     if(str.substring(i,j).equals("asd")){
                        c++;
                     }
                 }
             }
             return c;
         }


//        public static int similarSubstrin(String s){//the approach I was trying to go with during the interview this will only work if the given string accuratelly divided so that it can work with 3 index
//            String container = "asd";
//            String[] str = s.toLowerCase().replace(" ","").split("");
//            int count = 0;
//            int forCount = 0;
//            String res="";
//
//            for(String each: str){
//                if(forCount<=3){
//                    res+=each;
//                }
//                if(res.equals(container)) count++;
//
//                forCount++;
//
//                if(res.length()==3){
//                    forCount=0;
//                    res="";
//                }
//            }
//
//
//            return count;
//        }


    }


