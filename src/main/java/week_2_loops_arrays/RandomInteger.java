package week_2_loops_arrays;
import java.util.Random;

import static input.InputUtils.intInput;

public class RandomInteger {
    public static void main(String[] args) {
        //Create a Random object- this is a random number generator object

        Random random = new Random();

        int randomInteger = random.nextInt(100 + 1); //Generate a random number between 1-100.
        int guess = intInput("Guess the number!");

        while (guess != randomInteger) {
            System.out.println("That's wrong- try again!");

            if (guess < randomInteger) {
                System.out.println("Guess higher!");
            }
            if (guess > randomInteger) {
                System.out.println("Guess lower!");
            }
            guess = intInput("Guess the number!");

            System.out.println("Correct!");
        }
    }
}
