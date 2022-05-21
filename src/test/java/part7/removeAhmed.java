package part7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeAhmed {
    /*
    2.ArrayList -- Remove "Ahmed"
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed.
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        list.removeIf(e->e.equalsIgnoreCase("ahmed"));
        System.out.println("list = " + list);
        String[] arr = {"Ahmed", "John", "Eric", "Ahmed"};
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
