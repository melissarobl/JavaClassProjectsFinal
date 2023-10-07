package Week_3_methods;

public class MarathonWithMethods {

    public static void main(String[] args) {
//reworked Marathon java class to increase distance by user choice (5%, 10%, etc.)

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10;  //use to increase by 10%

        marathonSchedule(currentDistance, targetDistance, percentIncrease);
    }
    public static void marathonSchedule(double currentDistance, double targetDistance, double percentIncrease){

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
