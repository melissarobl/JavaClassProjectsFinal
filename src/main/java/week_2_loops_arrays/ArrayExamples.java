package week_2_loops_arrays;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

    //example int array
    int[] numbers = new int [3]; //number of items in array = 5, items 0-4
    numbers[0] = 4;
    numbers[1] = 100;
    numbers[2] = 3;

    //create an array to store strings: String[] name
    //one option for setting up array
    //String[] classNames = new String[3];  //keyword new means make a new array- we have to do this for anything that isn't a primitive data type (int, double, boolean, String)
       // classNames[0] = "Java";
        //classNames[1] = "C#";
        //classNames[2] = "Web";
      //Second option for setting up array:

        String[] classNames = { "Java", "C#", "Web", "Android", "iOS"};


    System.out.println("One of the second year classes is " + classNames[0]);

int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + " classes.");

        for (int x = 0; x<classNames.length; x++) { //print all the classes
            System.out.println("A class name is " + classNames[x]);
        }
        //Prints out location of array, not actual array:  System.out.println((classNames));
        //use this instead:

        System.out.println(Arrays.toString(classNames));
}
}

