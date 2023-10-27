package week_03.assigments;

import java.util.Scanner;

public class FutureDayCalculator {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer for today's day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6): ");
            int today = scanner.nextInt();

            System.out.print("Enter the number of days after today for a future day: ");
            int futureDays = scanner.nextInt();

            int futureDay = (today + futureDays) % 7;
            String futureDayName = daysOfWeek[futureDay];

            System.out.println("The future day after " + daysOfWeek[today] + " (" + today + ") by " + futureDays + " days will be " + futureDayName + " (" + futureDay + ").");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
