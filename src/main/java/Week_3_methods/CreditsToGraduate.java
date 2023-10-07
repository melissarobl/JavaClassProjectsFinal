package Week_3_methods;

import static input.InputUtils.intInput;

public class CreditsToGraduate {
    public static void main(String[] args) {
        int required = intInput("How many credits does your program require?");
        int earned = intInput("How many credits have you earned?");
        int needed = howManyCreditsToGraduate(required, earned);
        System.out.println("You need " + needed + " credits");
        //option 2 lines 7-10:
        //int creditsEarned = intInput("How many credits have you earned?");
        //int creditsNeeded = intInput("How many credits does your program require?");
        //int creditsToGraduate = howManyCreditsToGraduate(creditsNeeded, creditsEarned);
        //System.out.printf("you need %d credits to graduate. You've got this!", creditsToGraduate);
    }
    //Option 2 continued:
    // private static int howManyCredits to Graduate(int CreditsNeeded, int creditsEarned) {
     //return creditsNeeded - creditsEarned;


    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned) { //give a type and a name to parameters
        int creditsToGraduate = creditsNeeded - creditsEarned;
        return creditsToGraduate;

    }
}
