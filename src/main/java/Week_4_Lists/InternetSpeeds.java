package Week_4_Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class InternetSpeeds {
    public static void main(String[] args) {
        List<Double> speeds = new ArrayList<>();  //new list created called speeds

        int totalHours = 12; //number of hours to monitor

        for (int hour = 0; hour < totalHours; hour++) {
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed);  //regular loop to ask for the speed at every hour. Data added in this loop.
        }
        System.out.println("All the speeds are:");  //print out all the speeds

        for (int hour = 0; hour < speeds.size(); hour ++) {  //regular for loop to know the hour and the data
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d  Speed %.2f\n", hour, speed);
        }
        //Count the number of times the speed was 0
        int zeroCount = 0;
        for (double speed: speeds) { //enhanced for loop
            if (speed == 0) {
                zeroCount++;
            }
        }
        System.out.println("Number of times speed was 0 (no connection) : " + zeroCount);

        //Remove all zeros
        while (speeds.contains(0.0)) { //Why 0.0 and not just 0? Why while loop and not for loop- don't modify data when looping through list
            speeds.remove(0.0);

    }
       System.out.println(speeds);
        //figure out average speed
        double total = 0;
        for (double speed: speeds) {
            total = total + speed;
        }
        double average = total / speeds.size();
        System.out.println("The average speed is " + average);
    }
}
