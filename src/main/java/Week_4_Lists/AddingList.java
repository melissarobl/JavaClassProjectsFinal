package Week_4_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {
       List<Integer> classCodes = new ArrayList<>();
       classCodes.add(2545);
       classCodes.add(1150);
       classCodes.add(1250);

       classCodes.add (0, 1425); //add at position 0
        classCodes.add (2, 1100); //add at position 2

        System.out.println(Collections.min(classCodes));  //smallest number in list
        System.out.println(Collections.max(classCodes));  //largest number in list


        System.out.println(classCodes);
        System.out.println(classCodes.size());

        for (int classCode: classCodes){ //loop to go through a list of integers (either int or Integer will work on this line)
            System.out.println("ITEC" + classCodes);

            System.out.println("First code: " + classCodes.get(0));
            System.out.println("Last code: " + classCodes.get( classCodes.size()));

            classCodes.remove(0); //remove position 2 or by value 2? position 2!
            //to remove number use this:
            classCodes.remove(Integer.valueOf(1250));

            System.out.println(classCodes);

        }
    }
}
