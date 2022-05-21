package part5;

public class fizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(35));
    }

    public static String fizzBuzz(int a){
        String isFB="";

        if(a%3==0)
        isFB="Fizz";
        if(a%5==0)
            isFB="Buzz";

        return isFB.isEmpty()?"Not applicable":isFB;
    }
}
