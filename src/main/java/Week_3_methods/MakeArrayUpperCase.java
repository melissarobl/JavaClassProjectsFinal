package Week_3_methods;

import java.util.Arrays;

public class MakeArrayUpperCase {
    public static void main(String[] args) {
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};
        makeArrayUppercase(sponsors);
        System.out.println(Arrays.toString(sponsors));
        //only one array in the program. When method modifies array, it is modified in the array.
    }

    public static void  makeArrayUppercase(String[] array) {
        for (int x = 0 ; x < array.length; x++) {
            array[x] = array[x].toUpperCase();
        }

    }
}
