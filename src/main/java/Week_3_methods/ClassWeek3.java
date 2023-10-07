package Week_3_methods;

public class ClassWeek3 {
    public static void main(String[] args) {

        String username1 = "Jay-Z";
        printWelcome(username1);

        int letters = userNameLetters(username1); //one argument, returns an int
        System.out.println(username1 + ", your name has this many letters: " + letters);  // "Jay-Z" 5

        letters = userNameLettersCharacters(username1);
        System.out.println(username1 + ", Your name has this many letters: " + letters);  // "Jay-Z" 4, does not count the -

        System.out.println();  // empty line
        // Another example name

        String username2 = "Georgia O'Keefe";
        printWelcome(username2); //one argument, doesn't return anything

        letters = userNameLetters(username2);
        System.out.println(username2 + ", your name has this many letters: " + letters);   // "Georgia O'Keefe"  14

        letters = userNameLettersCharacters(username2);
        System.out.println(username2 + ", Your name has this many letters: " + letters);  // "Georgia O'Keefe"  13, does not count the '

    }


    public static void printWelcome(String userName) {
        String message = "Hello, " + userName + "!!!";
        System.out.println(message);
    }


    public static int userNameLetters(String userName) {  //returns an int
        // Remove non-alphabetic characters - we could improve on this,
        // names have ' and - and other non-alphabetic characters.
        String nameWithoutSpaces = userName.replace(" ", ""); //replace spaces with empty string
        int letterCount = nameWithoutSpaces.length();
        return letterCount;
    }


    public static int userNameLettersCharacters(String userName) {
        // Count the letter characters
        // char is another type in Java that represents one single character
        // it's actually a number type, and stores a unicode value
        char[] characters = userName.toCharArray();  // convert to array of char --cat to ['c', 'a', 't']
        int letterCount = 0;
        for (char c: characters) { //for every c in characters
            if (Character.isLetter(c)) { //skips over spaces and hyphens, etc.
                letterCount++;
            }
        }
        return letterCount;
    }
}