package week_2_loops_arrays;

import org.w3c.dom.ls.LSOutput;

import static input.InputUtils.doubleInput;

public class BusFareTotalArrayDayNames {
    public static void main(String[] args) {

        //An array with the names of each day of the week, used to create questions for the user
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double total = 0; //Will add each day's expenses to this variable to calculate the week's total

        for (int day = 0; day < dayNames.length; day++) { //Loop 7 times, once for each day of the week
            String dayName = dayNames[day]; //day will be 0, 1, 2, etc. up to 6.
            double dayExpense = doubleInput("On " + dayName + ", what did you spend on bus fares?");
            total = total + dayExpense; //add the day's expense to the total
        }
        System.out.printf("Total for the week = $%.2f", total);
    }
}

