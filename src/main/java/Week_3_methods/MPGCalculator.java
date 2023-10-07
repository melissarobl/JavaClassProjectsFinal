package Week_3_methods;

import static input.InputUtils.doubleInput;

public class MPGCalculator {
    public static void main(String[] args) {
        //how to interact with user
        double miles = doubleInput("Enter number of miles driven:");
        double gas = doubleInput("Enter gallons of gas used: ");

        double mpg = milesPerGallon(miles, gas);
        System.out.println("The MPG for this journey is " + mpg + " miles per gallon.");
    }
    public static double milesPerGallon(double miles, double gallonsOfGas) {
        double mpg = miles / gallonsOfGas;
        return mpg;
        //calculations that cam be reused in other code
    }
    //scope of variable is where variable exists
    //from where variable is declared until end of block
    //what you declare in main, doesn't exist in other methods
}
