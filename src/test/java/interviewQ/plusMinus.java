package interviewQ;

public class plusMinus {

    public static void solution(String str){
        String a="";
        String result="";
            for (int i1 = 0; i1 < str.length(); i1++) {
                a += "" + str.charAt(i1);
                if(a.equalsIgnoreCase("plus")) {
                    result += "+";
                    a="";
                }
                if(a.equalsIgnoreCase("minus")) {
                    result += "-";
                    a="";
                }
        }
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        solution("plusminusminusplus");
    }
}
