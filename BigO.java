import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * BigO
 */
public class BigO {

    public static void main(String[] args) {
        // fixed length array
        // int[] numbers = new int[3];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;
        // System.out.println(Arrays.toString(numbers));

ArrayList numbers = new ArrayList(3);
        numbers.add(1); //insert a item to the array 
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.remove(1); // remove a character
        System.out.println(numbers.indexOf(3)); //index of an item
    }
}