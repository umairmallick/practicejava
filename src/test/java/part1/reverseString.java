package part1;

public class reverseString {
    public static void main(String[] args) {
        String a = "Hello";
        String rev = "";
        int n = a.length();
        for (int i = n-1; i >= 0; i--) {
            rev+=a.charAt(i);
        }
        System.out.println(rev);
    }


}
