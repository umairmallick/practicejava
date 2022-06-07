package interviewQ;

public class dnaQuestion {

    public static void main(String[] args) {
        String str = "TACCGGACCTGAAGT";

        /**
         * Antisense strand of DNA: TACCGGACCTGAAGT
         *
         * mRNA: AUGGCCUGGACUUCA
         * Note: (converts T to A, A to U, C to G, G to C)
         *
         * Protein (amino acid): MKACS
         * Note: (converts using the RNA2ProteinTable below)
         *
         * RNA2ProteinTable
         *
         * AUG M
         * GCC K
         * UGG A
         * GCA T
         * ACU C
         * UCA S
         * GGG S
         */

        str = str.replace("T","a");
        str = str.replace("A","u");
        str = str.replace("C","g");
        str = str.replace("G","c");
        str = str.replace("A","u");
        str = str.replace("C","g");
        str = str.replace("G","c");

        str=str.toUpperCase();

        System.out.println(str);


        if(str.contains("AUG"))
            str = str.replace("AUG","M");
         if(str.contains("GCC"))
            str = str.replace("GCC","K");
         if(str.contains("UGG"))
            str = str.replace("UGG","A");
         if(str.contains("GCA"))
            str = str.replace("GCA","T");
         if(str.contains("ACU"))
            str = str.replace("ACU","C");
         if(str.contains("UCA"))
            str = str.replace("UCA","S");
         if(str.contains("GGG"))
            str = str.replace("GGG","S");

        System.out.println(str);


        String str1 =  "ATGTTTGTATATTAG";
        System.out.println(part1(str1));
        String str2 = part1(str1);
        String str3 = part2(str2);
        System.out.println(str3);
        String str4 = part3(str3);
        System.out.println(str4);

    }


public static String part1(String str){
    str = str.replace("T","U");
    return str;
}

    public static String part2(String str){


        int count = 0;
        String res = "";
        if(str.startsWith("AUG") && (str.endsWith("UAA")||str.endsWith("UAG")||str.endsWith("UGA"))){
            for (int i = 0; i < str.length(); i++) {
                res+=str.charAt(i);
                if(count==2){
                    res+=" ";
                    count=-1;
                }
                count++;
            }
        }
        return res.trim();
    }

    public static String part3(String str){
        str= str.replace(" ","");
        if(str.contains("AUG"))
            str = str.replace("AUG","Met ");
        if(str.contains("UUU"))
            str = str.replace("UUU","Phe ");
        if(str.contains("GUA"))
            str = str.replace("GUA","Val ");
        if(str.contains("UAU"))
            str = str.replace("UAU","Tyr ");
        if(str.contains("CGU"))
            str = str.replace("CGU","Avg ");
        if(str.contains("AAG"))
            str = str.replace("AAG","Lyu ");
        return str.trim();
    }


}
