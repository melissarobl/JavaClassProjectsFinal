package Week_5_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {  //hashMaps good for looking up value with its key, keys will get rearranged- can't depend on order

        Map<String, String> stateAbbreviations = new HashMap<>(); //TreeMap if you want info in alpha order
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa")); //.get returns 'null' if not on list

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin"); //be sure to enter with correct case on word to find
        System.out.println(wisconsinAbbreviation);

        for (String stateName : stateAbbreviations.keySet()) { //looping over set of keys
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }
        // Loop over HashMap values
        for (String abbreviation: stateAbbreviations.values()) {
            System.out.println(abbreviation); //wouldn't help us find key
        }
            // looking up abbreviations for states?
            // one way- loop over key-value pairs until value is found

        String searchAbbreviation = "MI";

        for (String stateName : stateAbbreviations.keySet()) { //looping over set of keys
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }

        }
        //another way = create a new hashmap = each key becomes a value, each value becomes a key
        Map<String, String> abbreviationsStateNames = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateNames.put(abbreviation, state);
        }

        System.out.println(searchAbbreviation);
        System.out.println(abbreviationsStateNames);

        System.out.println("There are " + stateAbbreviations.size()   + " states listed"); //figure out how many key value pairs there are
    }
}
