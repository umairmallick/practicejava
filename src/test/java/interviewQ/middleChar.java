package interviewQ;

public class middleChar {

    public static String missingChar(String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring(n+1,str.length());
        return front+back ;
    }
    public static int Babba(String str){
        String res=str;
        if(res.contains("AB"))
           res = res.replace("AB","");
        if(res.contains("BB"))
           res =  res.replace("BB","");

        System.out.println(res);
        return res.length();
    }

    public static void main(String[] args) {
        System.out.println(Babba("BABBABBBA"));//BBBBA
        String str = "edoc";
        char a = str.charAt(0);
        char b = str.charAt(str.length()-1);
        str = ""+a+str.substring(1,str.length()-1)+b;
        System.out.println(str);
        System.out.println(str.substring(0,1));
        System.out.println(str.substring((str.length()-1)/2));
        System.out.println(front3("ab"));

    }
    public static String front3(String str) {
        if(str.length()>3){
            str = str.substring(0,3);
            return str+str+str;
        }
        return str;
    }
}
