package part3;

import java.util.Arrays;

public class sortArrays {

    public static void main(String[] args) {
//        int[] awq = {4,85,2,3,4,5,6};
//
//        Arrays.sort(awq);
//        System.out.println("awq = " + Arrays.toString(awq));
//
//        int[] as = {1,45,15,3,654,65,2,8,23,3};
//
//        for (int i = 0; i < as.length; i++) {
//            int count = 0;
//            for (int i1 = i+1; i1 < as.length; i1++) {
//                if(as[i]>as[i1]){
//                    count=as[i];
//                    as[i]=as[i1];
//                    as[i1]=count;
//                }
//            }
//        }
//        System.out.println("Arrays.toString(as) = " + Arrays.toString(as));

        int[] intArr = {1,45,15,3,654,65,2,8,23,3};
        String[] strArr = {"z","d","g","r","f","g","h","j","k","l","o","p","i","y","t","r","e"};

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                if(intArr[i]<intArr[j]){
                  int  count=intArr[i];
                    intArr[i]=intArr[j];
                    intArr[j]=count;
                }


            }
        }

        System.out.println("intArr = " + Arrays.toString(intArr));

        for (int i = 0; i < strArr.length; i++) {
            String count = "";
            for (int j = i+1; j < strArr.length; j++) {
                if(strArr[i].charAt(0)>strArr[j].charAt(0)){
                    count = strArr[i];
                    strArr[i]=strArr[j];
                    strArr[j]=count;
                }
            }
        }

        System.out.println("intArr = " + Arrays.toString(strArr));

    }

}
