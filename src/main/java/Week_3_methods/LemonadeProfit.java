package Week_3_methods;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class LemonadeProfit {
    public static void main(String[] args) {
        double cookieProfit = calculateProfitForProduct("cookies");
        System.out.println("Cookie profit = $" + cookieProfit);

        double lemonadeProfit = calculateProfitForProduct("lemonade");
        System.out.println("Cookie profit = $" + lemonadeProfit);

        double coffeeProfit = calculateProfitForProduct("coffee");
        System.out.println("Coffee profit = $" + coffeeProfit);
    }
    public static double calculateProfitForProduct(String productName){
        System.out.println("How much did you spend on " + productName + " supplies?");
        double suppliesCost = doubleInput();
        System.out.println("What did you sell one " + productName + " for?");
        double salePrice = doubleInput();
        System.out.println("How many " + productName + " did you sell?");
        int quantitySold = intInput();

        //other option for writing sets of lines:
        //double suppliesCost = doubleInput("How much did you spend on" + productName + " supplies?");


        //Calculate profit
        double profit = (quantitySold * salePrice) - suppliesCost;
        return profit;
        //general method that can be used for any product
    }
}
