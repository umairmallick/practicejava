package part3;

public class uniqueChar {

    public static String unique(String str){
        String result="Unique characters are: ";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int i1 = 0; i1 < str.length(); i1++) {
                if(str.charAt(i)==str.charAt(i1))
                    count++;
            }

            if(count==1){
                result+=""+str.charAt(i);
            }

        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(unique("hello"));
    }


}
