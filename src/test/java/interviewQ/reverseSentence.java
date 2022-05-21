package interviewQ;

public class reverseSentence {

    public static void main(String[] args) {
        String str = "My name is John Smith.";
        boolean isUpcase = false;
        System.out.println(reverseSent(str, isUpcase));

    }

    public static String reverseSent(String str,boolean isUpcase){
        String a ="";
        String specialCharacter="";
        if(!Character.isLetter(str.charAt(str.length()-1)) &&
                Character.isLetter(str.charAt(str.length()-2))){
            specialCharacter=""+str.charAt(str.length()-1);
            str=str.replace(specialCharacter,"");
        }
        else return null;

        if(!isUpcase) a=str.toLowerCase();
        else a=str;

        String[] arrStr=a.split(" ");
        String reverse ="";
        for (int i = arrStr.length - 1; i >= 0; i--) {
            reverse+=arrStr[i]+" ";
        }

        if(!specialCharacter.isEmpty()) {
            reverse = reverse.trim();
            reverse+=specialCharacter;
        }

        return reverse;
    }

}
