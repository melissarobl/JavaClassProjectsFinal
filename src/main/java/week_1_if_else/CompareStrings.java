package week_1_if_else;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {
        String college = stringInput("Which college do you attend?");

                if (college.equalsIgnoreCase("MCTC")){
            System.out.println("Yay, MCTC!");
        } else {
                    System.out.println("Too bad, you should check out MCTC.");
                }
    }
}
