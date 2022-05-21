package interviewQ;

public class palindromicSubstrings {

    /*
 *  Longest Palindromic Substring
1. Given a string s, return the longest palindromic substring in s.


Example 1:
Input: s = "babad"
Output: bab

 */


    public static void palindromicSubstring(String str) {
        int max=0;
        String result="";
        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                //checking if the substring a palindrome or not
                if (isPalindrome(str.substring(i, j))) {
                    String pal = str.substring(i, j);
                    //isPalindrome method returns a single char as well so to counter that I used the below condition
                    if(pal.length()<2) continue;
                    //since we need the longest palindrome I'm using max variable to contain the only max length palindrome
                    if(pal.length()>max){
                        max=pal.length();
                        result=pal;
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {
        //loop with 2 pointers k & l - K after every loop increments & L decrements
        for (int k = 0,l=str.length()-1; k < str.length(); k++,l--) {
            //checks if the char at the pointers are not same, if true returns false
            if (str.charAt(k) != str.charAt(l)) {
                return false;
            }
        }
//        int i = 0, j = str.length() - 1;
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }


        return true;
    }
    public static void main(String[] args) {
        String str ="babad";// "cbbd"
        palindromicSubstring(str);
    }

}
