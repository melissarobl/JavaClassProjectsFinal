package week_1_if_else;

import static input.InputUtils.doubleInput;

public class Temp {
    public static void main(String[] args) {
        double tempYesterday = 100;
        //Alt + Enter to add doubleInput, stringInput
        double tempToday = doubleInput("What is today's temperature?");
        double tempAyerMore = (tempYesterday - tempToday);
        double tempHoyMore = (tempToday - tempYesterday);


        if (tempYesterday > tempToday) //if semicolon added here , it converts if control into a statement- so don't add one here
            {
            System.out.println("Yesterday was warmer by " + tempAyerMore + " degrees");
            //extra challenge - warmer by how many degrees
        } else {
            System.out.println("Today is warmer by "  + tempHoyMore + " degrees");
            // extra challenge - warmer by how many degrees
        }
    }
}
