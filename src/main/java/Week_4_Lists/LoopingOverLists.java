package Week_4_Lists;

import java.util.ArrayList;
import java.util.List;

public class LoopingOverLists {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        for (String name: classNames) { //less typing. This is the enhanced for loop
            System.out.println(name);
            // classNames.remove(0) //don't use classNames.remove(0); while looping over items this is an error
        }

        System.out.println(); //empty line

        for (int i = 0 ; i < classNames.size() ; i++ ) { //this one has index, if that is needed, as well as the data
            System.out.println(classNames.get(i));
            //classNames.remove(0); not an error, but doesn't behave correctly

        }
        System.out.println(); //empty line

        while(!classNames.isEmpty()) {
            String name = classNames.remove(0);
            System.out.println(name); //safest way to remove items in for loop
        }
        System.out.println(classNames);
    }
}
