package Week_3_methods;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10;  //use to increase by 10%

       int week = 1;
//loop counts the number of weeks
       while (currentDistance < targetDistance) {
           System.out.println(week + " " + currentDistance);
           currentDistance = currentDistance * percentIncrease;
           week++;  //only loops until distance is less than 26.2, but we want to know week to get to 26.2 (might be over)
       }
        System.out.println(week + " " + currentDistance);  //print out final week's information here
    }
}
