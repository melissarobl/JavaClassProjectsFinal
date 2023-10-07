package Week_3_methods;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
        //double number = doubleInput("please enter a number and I'll square it");
        //double squared = square(number);
        //square(number); for option 1 below instead of line 8 above
        //System.out.println("The square of " + number + " is " + squared);

        for (int x = 1; x <= 10; x++){
            double s = square(x);
            System.out.println("the square of " + x + " is " + s);
        }
    }
    //This method takes one argument, a number
    //It calculates the square of that number (by multiply it by itself)
    //and prints the number and its square
    // option 1
    //public static void square(double n) {
       // double sq = n * n;
       // System.out.println("The square of " + n + " is " + sq); //prints answer, does not return anything

public static double square(double n) {
        double sq = n * n;
        return sq;

    } //end of the squares method
} //end of the Squares class
 //methods should have only one job- doing math for example. Printing should be in main method. Makes it more resuable.