package Week_4_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangesToArray {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        Collections.sort(classNames);  //put in alpha order
       //Collections.shuffle(classNames);  //put in random order
        System.out.println(classNames);

        String alphabeticalFirst = Collections.min(classNames);
        //System.out.println(alphabeticalFirst);
    }
}