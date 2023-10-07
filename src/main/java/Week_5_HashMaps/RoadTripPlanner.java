package Week_5_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

public class RoadTripPlanner {
    public static void main(String[] args) {
       // Map<String, Integer> fromMpls = new HashMap<>();
        //if you know info won't change/need to be modified:
        Map<String, Integer> fromMpls = Map.of(
                "Duluth" , 154,
                "Brainerd", 127,
                "Stillwater", 26,
                "Ely", 245,
                "Red Wing", 54);
//        fromMpls.put("Duluth", 154);
//        fromMpls.put("Brainerd", 127);
//        fromMpls.put("Stillwater", 26);
//        fromMpls.put("Ely", 245);
//        fromMpls.put("Red Wing", 54);

        System.out.println(fromMpls);

        int maxDrive = positiveIntInput("What is the maximum distance you want to drive?");

        List<String> citiesInRange = new ArrayList<>(); //save all cities in a range in a list

        for (String city : fromMpls.keySet()) {
            int distance = fromMpls.get(city);
            if (distance <= maxDrive) {
                System.out.println(city + " is " + distance + " miles away.");
                citiesInRange.add(city);
            }
        }
        if (citiesInRange.isEmpty()) {
            System.out.println("Sorry, no Minnesota cities are within your driving distance.");
        } else {
            System.out.println(citiesInRange);
            System.out.println("Here are the cities you can drive to:  " + citiesInRange.size());
            for(String city: citiesInRange) {
                System.out.println(city);
            }
        }
    }
}

