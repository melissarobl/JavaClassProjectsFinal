package week_2_loops_arrays;

import static input.InputUtils.stringInput;

public class WhileTrue {
    public static void main(String[] args) {
        //while (true) {
            //System.out.println("Hello!");
        //}
        String secretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password");

        int maxGuesses = 5;

        //Always use the .equals() method to check if two Strings have the exact same characters

        //Before we let the user in, we need to check that the password is correct
        //This loop will repeat while the password is NOT "kittens", our secretPassword
        while(! userPassword.equals(secretPassword) && maxGuesses > 1) {
            //The user got the password wrong. Print an error message
            System.out.println("Password incorrect, access denied!");
            //And ask user to try again.
            System.out.println("Try again");
            //Replace userPassword with the user's next attempt.
            userPassword = stringInput("Enter the password");
            //If the user gets it wrong again, the loop will repeat

            maxGuesses--;
        }
        //If the loop condition is false, then the user got the password right.
        //Print 'access granted' method
        if (maxGuesses > 1) {
            System.out.println("Correct password- access granted");
        }
        else {
            System.out.println("Max number of password attempts reached.");
            System.exit(0);
        }

    }
}
