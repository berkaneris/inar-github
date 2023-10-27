package week_02.assigments;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        double rate = 5.0 / 100 / 12;
        double total = saving * (1 + rate); // end of first month
        total = (total + saving) * (1 + rate); // end of second month
        total = (total + saving) * (1 + rate); // end of third month
        total = (total + saving) * (1 + rate); // end of fourth month
        total = (total + saving) * (1 + rate); // end of fifth month
        total = (total + saving) * (1 + rate); // end of six month
        System.out.println("After the sixth month, the account value is $" + (int)(total*100)/100.0);
    }
}
