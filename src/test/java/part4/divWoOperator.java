package part4;

public class divWoOperator {

    public static int quotient(int divisor, int dividend){
        int quotient = 0;
        while (dividend>0){
            dividend -=divisor;
            quotient++;
        }

        return quotient;
    }

    public static void main(String[] args) {
        System.out.println("quotient(6,2) = " + quotient(2, 6));
    }

}
