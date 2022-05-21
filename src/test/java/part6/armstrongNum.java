package part6;

public class armstrongNum {

    /*
    Armstrong numbers
    Write a method that can check if a number is Armstrong  number.
    Armstrong number is a number that is equal to the sum of cubes of its digits.
    370 = 3*3*3 + 7*7*7 + 0*0*0;
    1

    153 = 1*1*1 + 5*5*5 + 3*3*3;
   153 = 1 + 125 + 27;
     */
    public static void main(String[] args) {
        int num = 1531;
        System.out.println(armstrongNumber(num));
    }

    public static boolean armstrongNumber(int a){
        String numStr = String.valueOf(a);
        int n = numStr.length();
        int ans=0;

        for (int i = 0; i < n; i++) {
            int b = Integer.parseInt(""+numStr.charAt(i));
            ans += Math.pow(b,n);
        }
        return ans == a;
    }

}
