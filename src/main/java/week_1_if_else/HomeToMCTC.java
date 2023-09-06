package week_1_if_else;

import static input.InputUtils.positiveDoubleInput;

public class HomeToMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;
        System.out.println("You live " + km + " kilometers from school.");

        //does the user live more than 10 miles away?

        if (miles > 10 ){
        System.out.println("You live more than 10 miles from MCTC.");
        } else if (miles < 10){
            System.out.println("You live less than 10 miles from MCTC.");
        } else {
            System.out.println("You live exactly 10 miles from MCTC.");
        }
    }
}
