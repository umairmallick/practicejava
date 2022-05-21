package interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pangram {
    public static void main(String[] args) {


        //String str = "";
        System.out.println("isPangram() - The quick brown fox jumps over the lazy dog =" +isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println("\nisPangram() - Mr. Jock, TV quiz PhD., bags few lynx12 =" +isPangram("Mr. Jock, TV quiz PhD., bags few lynx12"));
        System.out.println("\nisPangramNumAndSpecial() - Mr. Jock, TV quiz PhD., bags few lynx12 =" +isPangramNumAndSpecial("Mr. Jock, TV quiz PhD., bags few lynx12"));
        System.out.println("\nisPangramNumAndSpecial() - Mr Jock TV quiz PhD bags few lynx =" +isPangramNumAndSpecial("Mr Jock TV quiz PhD bags few lynx"));
    }



    /**This method can be used when the user wants to remove all the special characters & numbers from the string
     * and check if the given string is a Pangram or not
     */
    public static boolean isPangram(String str){
        char a = 'a';
        String res = str;

        //replace all special characters and  numbers from the original string
        res = res.replaceAll("[^a-zA-Z]", "");

        //convert the given string to a list and to change all letters to lower case
        List<String> listAct = new ArrayList<>(Arrays.asList(res.toLowerCase().split("")));
        List<String> listExp = new ArrayList<>();

        //checking duplicates, if present it will return false
        for (String each : listAct) {
            int count = Collections.frequency(listAct,each);
            if(count>1){
                return false;
            }
        }

       //With this while loop we are going to add all the alphabets in listExp from 'a' till the loop reaches 'z'
        while (a<='z'){
            listExp.add(""+a++);
        }

        //We'll sort it alphabetically
        Collections.sort(listAct);

        //this will check if our listExp = listAct & if it is equals return true
        return listExp.equals(listAct);
    }


    /**This method when the user provides pure string with no special characters & numbers
     * and check if the given string a Pangram or not
     */
    public static boolean isPangramNumAndSpecial(String str){
        char a = 'a';
        String res = str;
        //remove space
        res = res.replace(" ","");
        //this will check if we have any special characters present in the string, if yes it will return false
        for (int i = 0; i < res.length(); i++) {
            if(!Character.isLetter(res.charAt(i))){
                return false;
            }
        }

        //convert the given string to a list and to change all letters to lower case
        List<String> listAct = new ArrayList<>(Arrays.asList(res.toLowerCase().split("")));
        List<String> listExp = new ArrayList<>();

        //checking duplicates, if present it will return false
        for (String each : listAct) {
            int count = Collections.frequency(listAct,each);
            if(count>1){
                return false;
            }
        }

        //With this while loop we are going to add all the alphabets in listExp from 'a' till the loop reaches 'z'
        while (a<='z'){
            listExp.add(""+a++);
        }

        //We'll sort it alphabetically
        Collections.sort(listAct);


        //this will check if our listExp = listAct & if it is equals return true
        return listExp.equals(listAct);
    }

}
