package Week_4_Lists;

import java.util.ArrayList;
import java.util.List;

public class ListsExample1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Me");
        arrayList.add("MCTC");

        for (String s: arrayList) { //for string s in array list
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length()); //s is a string variable

    }
        System.out.println(arrayList);
    }

}
