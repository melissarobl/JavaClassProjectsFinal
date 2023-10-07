package Week_3_methods;

import static input.InputUtils.stringInput;

public class HelloMethods {
    //This is the main method- the first code to run
    public static void main(String[] args) {
        String name = stringInput("Please enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    } //This is the end of the main method

    //A new method that we've created.
    //This method takes one argument, a String.
    //it will create a new String made from the word "Hello"
    //plus the String argument, plus an exclamation point!
    //It will then return that new greeting String.
    public static String makeGreeting(String n) { //String = return type, if nothing being returned, use "void" instead
        String greeting = "Hello " + n + "!";
        return greeting;

    } //end of the makeGreeting method
} //end of Hello Methods Class
