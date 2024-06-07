package com.mycompany.leapmonth;

/**
 *
 * @author user 2022
 */
 import java.util.Scanner;

public class LeapMonth2 {

    public static void main(String[] args) {
        // Declare the variables
        int year;
        int month;
        
        boolean isLeapMonth;

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        // Prompt the user to enter a month
        System.out.print("Enter a month (1-12): ");
        month = scanner.nextInt();

        isLeapMonth = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

        isLeapMonth = isLeapMonth && (month == 0);

        if (isLeapMonth) {
            System.out.println(month + " is a leap month.");
        } else {
            System.out.println(month + " is not a leap month.");
        }
        scanner.close();
    }
}