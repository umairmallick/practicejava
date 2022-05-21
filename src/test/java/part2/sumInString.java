package part2;

public class sumInString {

    public static int sumFromString (String str){
//        // A temporary string
//        String temp = "0";
//
//        // holds sum of all numbers present in the string
//        int sum = 0;
//
//        // read each character in input string
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            // if current character is a digit
//            if (Character.isDigit(ch))
//                temp += ch;
//
//                // if current character is an alphabet
//            else {
//                // increment sum by number found earlier
//                // (if any)
//                sum += Integer.parseInt(temp);
//
//                // reset temporary string to empty
//                temp = "0";
//            }
//        }
//
//        return sum + Integer.parseInt(temp);

        int sum=0; String temp = "0";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) temp+=str.charAt(i);
            else {
                sum+=Integer.parseInt(temp);
                temp="0";
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println("sumFromString ="+ sumFromString("a5a5a500a"));
    }

}
