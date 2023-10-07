package Week_5_HashMaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class SnowOption3 {
    public static void main(String[] args) {

        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1); //using put method to add months and amounts
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);
        System.out.println(snowfall);

        for (String month : snowfall.keySet()) { //use loop to print out each set on separate line
            double snow = snowfall.get(month);
            System.out.printf("The snow in %s was %.2f inches\n", month, snow);
        }

        snowfall.put("February", 12.4);

        System.out.println(snowfall);

        System.out.println("The snow in January is " + snowfall.get("January") + " inches");

        System.out.println("The snow in July is " + snowfall.get("July") + " inches");

        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There was no snow in July.");
        }

        String newMonth = stringInput("Enter month ");
        double newSnow = positiveDoubleInput("Enter snow for " + newMonth);


        Double snow = snowfall.get(newMonth);

        if (snow != null) { //test to see if key in HashMap
            // ask if should overwrite

            System.out.println("The hashmap already contains that month, " + newMonth + " snow = " + snow + " inches");
            boolean overwrite = yesNoInput("Overwrite data?");
            if (overwrite) { //if we DO want to overwrite data,
                snowfall.put(newMonth, newSnow);
            } else { //otherwise print that data was not added
                System.out.println("Data was not added.");
            }
        } else { //if not already in HashMap, add it
            snowfall.put(newMonth, newSnow);
        }
        System.out.println(snowfall);
    }
}