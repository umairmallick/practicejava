package interviewQ;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class stringMoneytoInt {

    public static void main(String[] args) {
       String num = "14200.25";
       dollar(num);


    }

    public static void dollar(String str){
        Double num = Double.parseDouble(str);
        //Create locale object to get geopolitical info
        Locale usa = new Locale("en","US");
        //Format number based on locale
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(usa);
        System.out.println(numberFormat.format(num));

    }


}
