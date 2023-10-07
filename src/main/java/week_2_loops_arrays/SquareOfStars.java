package week_2_loops_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

public class SquareOfStars {
    public static void main(String[] args) {
        //display a square of *
        //one option to change size of square is to declare size variable
        //int size = 5;
        //another option to change size of square is to ask user to enter the number
        int size = positiveIntInput("Enter size of square");
        String character = stringInput("Enter the character you wish to use");


        //The outer loop prints one row per loop repeat
        for (int x = 0 ; x < size ; x++ ){
            //inner for loop. For each row, print a star 5 times
            for (int y = 0 ; y <size; y++) {
                //notice System.out.print - not println. This doesn't add the new line
                //at the end of the output, so all the stars are on the same line
                System.out.print(character);
            }
                //And then move to the next line
                System.out.println();

            }

        }
    }
