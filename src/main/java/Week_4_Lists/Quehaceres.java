package Week_4_Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class Quehaceres {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>(); //new array list created

        while (true) {
            String data = stringInput("Please type a task you need to do, or press Enter to quit");
            //if (data.length() == 0) { //If the user just presses Enter, the length of text is 0, simplify by using this:
            if (data.isEmpty()) {
                break;
                }
            if (containsIgnoresCase(todoList, data)) {
                System.out.println("You already added that!");

                //if (todoList.contains(data)){
                   // System.out.println("You already added that to your list.");
                } else{
                    todoList.add(data); //add what user types in to the list
                }
            }

        System.out.println("Thank you, here are all of the tasks you entered:");
        for (String input : todoList)   { //enhanced "to do" list with all the data entered
            System.out.println(input);
        }
        System.out.println("You have " + todoList.size() + " tasks on your to do list");
    }
    public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item: list) {
            if ( item.equalsIgnoreCase(data)) {
                return true;
            }
        }
       return false; //if string is not found after going through loop, return false
    }
}
