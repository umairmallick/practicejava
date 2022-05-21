package part3;

public class permutationArr {

    public static void main(String[] args) {
        char[] arr = {'a','b','c'};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(i!=j && j!=k && k!=i)
                        System.out.println(""+arr[i]+arr[j]+arr[k]);
                }
            }
        }
    }

}
