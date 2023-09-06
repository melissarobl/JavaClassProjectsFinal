package org.example;

import static input.InputUtils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        String userName = stringInput("Please enter your name: ");
        System.out.println("Welcome, " + userName);

        int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");

        String units = "classes";
        if(numberOfClasses ==1){
            units = "class";
        }
        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester.");
        System.out.printf("You are taking %d %s this semester.", numberOfClasses, units);
    }
}