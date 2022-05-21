package part7;

public class reverseNegNum {

    /*
    1.Number -- Reverse negative number
    Write a return method that can reverse negative number and return it as int.

    num = -1234;
    reversedNum = -4321;
     */

    public static int revNegNum(int num){
       int number = num;
       int remainder=0;
       int reverse = 0;
       while (number<0){
           remainder = number%10;
           reverse = reverse*10+remainder;
           number/=10;
       }


        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("revNegNum(-1234) = " + revNegNum(-1234));
    }

}
