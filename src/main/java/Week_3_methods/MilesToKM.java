package Week_3_methods;

import static input.InputUtils.doubleInput;

public class MilesToKM {
    public static void main(String[] args) {
        double miles = doubleInput("Enter a number of miles ");
        double km = milesToKM(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometers");
    }

    private static double milesToKM(double miles) {
        double km = miles * 1.6;
        return km;
        //error would be to not return anything or returning the wrong type
        //return miles * 1.6; shorter code than using lines 13 and 14
    }
}
