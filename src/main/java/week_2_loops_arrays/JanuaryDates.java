package week_2_loops_arrays;

public class JanuaryDates {
    public static void main(String[] args) {
        System.out.println("Here are all the dates in January");
        for (int day = 1; day <= 31; day++) {
            if (day == 1 || day == 21 || day == 31) {
                System.out.println("January " + day + "st");
            } else if (day == 2 || day == 22) {
                System.out.println("January " + day + "nd");
            } else if (day == 3 || day == 23) {
                System.out.println("January " + day + "rd");
            } else {
                System.out.println("January " + day + "th");
            }
            }
        }
    }
