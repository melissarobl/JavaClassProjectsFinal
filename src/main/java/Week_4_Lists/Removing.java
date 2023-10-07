package Week_4_Lists;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");


        System.out.println(classNames);

        //remove by value
        classNames.remove("Project Management"); //needs to be exact--this is an object
        System.out.println(classNames);

        //remove by position;
        classNames.remove(0); // int primitive type- index are primitive int type
        System.out.println(classNames);

        boolean wasRemoved = classNames.remove("Programming Logic");
        System.out.println(classNames + " " + wasRemoved);

        //modify first element
        classNames.set(0, "Systems Analysis");
        System.out.println(classNames);

//option 1
        String search = "C# Programming";
        if (classNames.contains(search)) {
            System.out.println("The list does contain " + search);

        }else {
            System.out.println("The list does not contain " + search);
        }


        // Option 2:
        // (classNames.contains("C# Programming")) {
        // System.out.println("The list does contain C#");

        //}else {
        // System.out.println("The list does not contain C#");

        System.out.println(classNames.size());

        classNames.clear();  //clear list
        System.out.println(classNames);
        System.out.println(classNames.size()); //check if it is empty
        System.out.println(classNames.isEmpty()); //check if it is empty

        }
    }

