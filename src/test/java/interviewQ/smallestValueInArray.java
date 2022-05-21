package interviewQ;

import java.util.Arrays;

public class smallestValueInArray {

    public static void solution(int[] arr){
        int min=464653143;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println("min = " + min);
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,-2,2};
        solution(arr);
    }
}
