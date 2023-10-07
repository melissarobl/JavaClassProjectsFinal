package Week_3_methods;

import org.junit.Test;

import static Week_3_methods.ClassWeek3.userNameLetters;
import static org.junit.Assert.*;

public class ClassWeek3Test {

    @Test
    public void testUserNameLetters() {
        //code that can test your code- does it work?
        //a unit test - testing one unit of the program the unit is a method

        String exampleName = "Buster";
        int expectedLetters = 6;

        int lettersCalculated = ClassWeek3.userNameLettersCharacters(exampleName);

        assertEquals(lettersCalculated, expectedLetters);
    }
    @Test
    public void userNameLettersCharacters() {
        String exampleName ="Olivia Newton-John";
                int expectedLetters = 16;
        int lettersCalculated = ClassWeek3.userNameLettersCharacters(exampleName);
        assertEquals(expectedLetters, lettersCalculated);

        //todo fill this in
    }
}