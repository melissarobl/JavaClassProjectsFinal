package week_2_loops_arrays;

public class OilChange {
    public static void main(String[] args) {
        // Car mileage

        int mileage = 150000;
        int interval = 3000;
        //solution 1:
       // for (int oilChange = 0 ; oilChange < 8; oilChange++) {
       //     mileage = mileage + interval;
       //     System.out.println("Get oil change at " + mileage + " miles" );
       // }

        //solution 2:
        for (int miles = mileage; miles < (mileage + 8 * interval); miles+=interval) {
            System.out.println("Get oil change at " + miles + " miles");
        }
}
}