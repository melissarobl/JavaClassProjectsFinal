package week_1_if_else;

import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

public class FirstIfStatement {

//psvm shortcut

    public static void main(String[] args) {

        //If errors, put your cursor on stringInput and press Alt+Enter
        String message = stringInput("Enter some text:");
        System.out.println("Thanks, your message was " + message);

        double price = doubleInput("Please enter the price of chips:");
        System.out.println("Thanks, the price is " + price);

        if (price < 0) { //parentheses  are required here, as is the curly brace
            System.out.println("That is an error, price can't be negative.");
        } else if (price == 0) {
            System.out.println("They are free!");
        } else {
            System.out.println("Thanks, the price is $" + price);
        }
    }
}