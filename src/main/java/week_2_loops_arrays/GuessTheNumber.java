package week_2_loops_arrays;

import static input.InputUtils.intInput;

public class GuessTheNumber {
    public static void main(String[] args) {

        //code for guessing a number between 1-10. Number is integer in code
        int secretNumber = 6;

        int guess = intInput("Guess the number!");

        while (guess != secretNumber) {
            System.out.println("That's wrong- try again!");

            if(guess < secretNumber) {
                System.out.println("Guess higher!");
            }
            if (guess > secretNumber) {
                System.out.println("Guess lower!");
            }
            guess = intInput("Guess the number!");
        }

        System.out.println("Correct!");
    }
}
