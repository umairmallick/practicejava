package part2;

public class maxInArray {

    public static void main(String[] args) {
        int[] arr ={1,85,6,9,7,31};
        int max = arr[0];
        for (int e : arr) {
            if(max<e) max = e;
        }
        System.out.println(max);
    }
}
