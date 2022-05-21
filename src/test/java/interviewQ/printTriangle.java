package interviewQ;

public class printTriangle {
    public static void main(String[] args) {
        String a = "*";
        for (int i = 0; i < 5; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

}
