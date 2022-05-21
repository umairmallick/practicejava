package part3;

import java.util.Arrays;

public class shiftZeroes {

    public static int[] shiftZero(int[] arr){
        int[] ans = new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) ans[count++]=arr[i];
        }
        for (int j : arr) {
            if (j > 0) ans[count++] = j;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 4, 0};
        System.out.println("shiftZero(arr) = " + Arrays.toString(shiftZero(arr)));

    }

}
