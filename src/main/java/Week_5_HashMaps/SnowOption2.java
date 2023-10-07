package Week_5_HashMaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class SnowOption2 {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();

        snowfall.put("January", 3.1); //using put method to add months and amounts
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);
        String newMonth = stringInput("Enter month ");
        double newSnow = positiveDoubleInput("Enter snow for " + newMonth);

        boolean overwrite = true; //default is true

        if (snowfall.containsKey(newMonth)) { //check to see if in hashmap already
            double snow = snowfall.get(newMonth);
            System.out.println(newMonth + " is already in the HashMap");
            System.out.println("Snowfall for " + newMonth + " was " + snow + " inches.");
            overwrite = yesNoInput("Do you want to overwrite the old data?"); //if no is typed, overwrite is false
        }

        if(overwrite) {
            snowfall.put(newMonth, newSnow); //if overwite true, new data written to hashmap
        } else {
            System.out.println("HashMap was not modified."); //if false, not modified
        }
    }
}
