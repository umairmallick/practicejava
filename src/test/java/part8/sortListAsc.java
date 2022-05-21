package part8;

import java.util.ArrayList;
import java.util.Arrays;

public class sortListAsc {

    public static ArrayList<Integer> listAsc(ArrayList<Integer> arrayList){
        ArrayList<Integer> list = arrayList;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)<list.get(j)) {
                    int count = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,count);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,6,4,1));
        System.out.println(listAsc(list));
    }

}
