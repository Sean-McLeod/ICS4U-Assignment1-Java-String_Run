/*
* This is a program that finds
* the largest run in the string.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-04-30
*/

import java.util.Scanner;


final class StringRun {
    private StringRun() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }


    public static int maxRun(final String stringToCheck) {

        int maximumRun = 1;
        int latestRun = 1;

        for (int loopCounter = 1; loopCounter < stringToCheck.length();
             loopCounter++) {
            if (stringToCheck.charAt(loopCounter)
                == stringToCheck.charAt(loopCounter - 1)) {
                /* if a letter equals the letter before it,
                the latest run increases */
                latestRun++;
                if (latestRun > maximumRun) {
                    /* if the latest run is greater than the max run,
                    latest run becomes the max run */
                    maximumRun = latestRun;
                }
            } else {
                latestRun = 1;
            }
        }
        return maximumRun;
    }


    public static void main(final String[] args) {
        int maximumRun;
        String stringToCheck;

        System.out.println("This program will show the largest run "
                           + "of your input");

        // input
        Scanner userString = new Scanner(System.in);
        System.out.println("Enter string: ");

        stringToCheck = userString.nextLine();

        // pass & accept parameters
        maximumRun = maxRun(stringToCheck);
        // output
        System.out.println("\nThe largest run is: " + maximumRun);
    }
}
