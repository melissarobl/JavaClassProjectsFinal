package week_1_if_else;

import static input.InputUtils.stringInput;

public class FirstIfStatement {

//psvm shortcut

public static void main(String[] args) {

    //If errors, put your cursor on stringInput and press Alt+Enter
    String message = stringInput("Enter some text:");
    System.out.println("Thanks, your message was " + message);
}
}