package Week_4_Lists;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {

        List<String> animals = List.of("Cat", "Bird", "Zebra");  //creates list that cannot be added to or subtracted from
        System.out.println(animals);
    }
}
