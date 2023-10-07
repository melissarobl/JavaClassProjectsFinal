package Week_4_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {

        // Random rnd = new Random(); //Create a Random object- this is a random number generator object
        //int randomNumber = rnd.nextInt(10); //between 0-9
        //int randomNumberBetween1and10 = rnd.nextInt(10) +1; //to numbers 1-10
        //System.out.println((randomNumber + " " + randomNumberBetween1and10)); //put space in between so program doesn't add the two integers

        List<String> guestList = new ArrayList<>();

        while (true) {
            String name = stringInput("Enter name of guest or enter to quit");

            if (name.isEmpty()) {
                break;
            }
            if (containsIgnoresCase(guestList, name)) {
                System.out.println("you already added " + name);
            } else {
                System.out.println("Adding " + name + " to list");
                guestList.add(name);
            }

        }
        Collections.sort(guestList); //sort guest list alphabetically

        printGuestNames(guestList);

        //Remove guests from list if needed

        while (yesNoInput("Do you want to remove any guests?")) {
            System.out.println("Here are all the guests:");
            printGuestNames(guestList); //call the method with the guestList

            //while loop should stop/break if there are no guests
            if (guestList.isEmpty()) {
                System.out.println("There are no more guests to remove");
                break;
            }

            int index = positiveIntInput("Enter the number of the guest to remove");
            index--; //subtract one from index since it starts from 1 and computers start from 0
            //before we remove guests, make sure number is within index range
            if (index < 0 || index >= guestList.size()) { //
                System.out.println("Error - please enter a valid number of a guest");

            } else {
                String removedGuest = guestList.remove(index); //remove that guest from list via index number, declare as variable so can be used in print confirmation
                System.out.println("Removed guest " + removedGuest);
            }
        }

        printGuestNames(guestList); //call the method with the guestList after removing guests
        System.out.println("The number of guests in the guest list is " + guestList.size()); //print the final guest list
        selectPrizeWinner(guestList);

    }
public static void selectPrizeWinner(List<String> guests) {
        if (guests.isEmpty()) {
            System.out.println("Warning- no guests - no one to win a prize");
            return;

        }
    Random rng = new Random(); //Create a Random object- this is a random number generator object
    int randomGuestIndex = rng.nextInt(guests.size());  //need a random number - in this case 0, 1, 2, 3

    String prizeWinner = guests.get(randomGuestIndex); //declare variable to use name of winner instead of index
    System.out.println("Guest number " + (randomGuestIndex+1) + " " + prizeWinner + " wins a prize!");  //probably better to return value instead of printing because return makes method
    //more useful to computer and for future use in programs. Printing makes it more specific and less useful.

}
    public static void printGuestNames (List<String> guests) { //prints out the names user enters
        System.out.println("Your guest list is: \n");

        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list.");  //make it more user-friendly if the list is empty
        } else {
            for (int i = 0 ; i < guests.size() ; i++) {
                System.out.println((i + 1) + ":" + guests.get(i));
        }

        }
    }
    public static boolean containsIgnoresCase(List<String> list, String data) { //look for any case when looking for duplicates
        for (String item: list) {
            if ( item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false; //if string is not found after going through loop, return false
    }
}
