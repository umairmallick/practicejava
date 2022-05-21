package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumEqualsZero {

    public static void main(String[] args) {
//        //size
//        int[] arr = new int[10];
//        int sum = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = i;
//            sum += i;
//        }
//        arr[arr.length - 1] = -sum;
//
//        System.out.println(Arrays.toString(arr));
//
//        int n=5;
//        List<Integer> arrList = new ArrayList<>(n);
//
//        if (n % 2 == 0) {
//            for (int i = 1; i <= n / 2; i++) {
//                arrList.add(i);
//                arrList.add(-i);
//            }
//        } else {
//            arrList.add(0);
//            for (int i = 1; i <= n / 2; i++) {
//                arrList.add(i);
//                arrList.add(-i);
//            }
//
//
//
//        }
//        System.out.println("arrList = " + arrList);

        int n =5;
        int[] intArr = new int[n];

        if(n%2==0){
            for (int i = 0; i < intArr.length; i++) {
                intArr[i++] = i;
                intArr[i] = -i;
            }
        }
        else {
            for (int i = 1; i < intArr.length; i++) {
                intArr[i++] = i;
                intArr[i] = -i;
            }
        }
        System.out.println("intArr = " + Arrays.toString(intArr));
    }

}
