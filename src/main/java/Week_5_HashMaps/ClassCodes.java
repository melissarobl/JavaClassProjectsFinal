package Week_5_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {

    public static void main(String[] args) {
        /* Create a new HasMap of class codes, and class names that you are taking this semester
        For example, 2545 and Java, 1425 and Datacom, 2560 and Web
        What data type will the keys and values be? */
        Map<Integer, String> classCodes = new HashMap<>();
        classCodes.put(2545, "Java");
        classCodes.put(1425, "Datacom");
        classCodes.put(2560, "Web");
        classCodes.put(2417, "Android");

        //Write a loop that prints all the class codes and names in the form "ITEC 2545 Java"
        for (Integer classCode: classCodes.keySet()) {
            String className = classCodes.get(classCode);
            System.out.println("ITEC " + classCode + " " + className);
        }
        //Print the number of classes you are taking and add this variable - size of the HashMap

        System.out.println("I am taking " + classCodes.size()   +  " classes");
        //save in variable if you prefer:
        int numberOfClasses = classCodes.size();

        int searchCode = 2417; //Android programming- add this variable

      //  Can you write an if-statement to check if this code is in the HashMap and print the class name if so? Print a "Not found" message if not
        if (classCodes.containsKey(searchCode)) {
            System.out.println("This class is found in the HashMap. The class name is " + classCodes.get(searchCode));
        } else {
            System.out.println(searchCode + " not found");
        }

       // Add this variable
        int searchCode2 = 2545; //That's us!

        String className = classCodes.get(searchCode2);
        if(className == null)   {
            System.out.println(searchCode2 + " not found");
        } else {
            System.out.println("This class is found in the HashMap. The class name is " + className);
        }

        //Can you write an if-statement to check if this code is in the HashMap
        //Print the class name if so? Print a "Not found" message if not

    }
}
