package week_1_if_else;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {
        //When taking week_1_if_else.Welding classes at MCTC, you must dress safely.
        //You should wear cotton or wool clothes. And you should wear closed-toe shoes.

        //This program checks if a student is dressed safely for welding

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        if ((cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("You are dressed safely.");
        } else {
            System.out.println("You must wear cotton or wool clothes and closed toe shoes.");
        }
    }
}
