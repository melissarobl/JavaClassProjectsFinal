package week_2_loops_arrays;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

        int numberOfDays = 7;
        double total = 0; //something to add first total onto

        for (int day = 1; day <= numberOfDays ; day++) {
            double amountSpent = doubleInput("How much did you spend on bus fares on day " + day + "?");
            total = total + amountSpent;
        }
        System.out.printf("Total Spent for the week = $%.2f", total);
    }
}
