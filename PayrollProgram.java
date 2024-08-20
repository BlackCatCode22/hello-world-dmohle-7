// dH 8/20/24
/*
 * PayrollProgram.java
 *
 * Input: User's name, weekly hours worked (no hour fractions), user's hourly payrate
 *
 * Processing: total weekly pay including overtime if more than 40
 *    hours were worked that week.
 *
 * Output: Polite greeting to the user and regular pay and overtime pay
 *
 *
*/
//

import java.util.Scanner;



public class PayrollProgram {
    public static void main(String[] args) {
        System.out.println("\n\n....Welcome to the Payroll Program...\n");

        // Variables used in this program.
        String userName = "";
        int hoursWorked = 0;
        int overtimeHours;
        int payRate = 0;

        int anotherNumber;
        double hrlyPayRate = 0.0;
        double weeklyPayWithoutOvertime = 0.0;
        double overTimePay = 0.0;


        // Say hello to the user and get user pay information.
        // Get the user's name.
        // Create a Scanner object to get input from the user.
        Scanner myScannerObj = new Scanner(System.in);

        // Get the user's name.
        System.out.println("\n Please enter your name: ");
        userName = myScannerObj.nextLine();

        System.out.println("\n Hello, " + userName + ". I hope you're doing well today.");

        // Get weekly hours worked from the user.
        // Output statement prompting the user for hrs worked
        System.out.println(" \n Please enter how many hours you worked this week \n(please use whole numbers): ");
        // Use the Scanner object to get input from this prompt, and store what was returned
        // from your Scanner object in a variable
        hoursWorked = myScannerObj.nextInt();

        System.out.println(" \n Please enter your hourly pay rate \n(please use whole numbers): ");
        payRate = myScannerObj.nextInt();


        // Create an output statement to the used echoing the user's input.
        System.out.println("\n Hey " + userName + " you worked: " + hoursWorked + " this week!");

        // Processing
        overtimeHours = hoursWorked - 40;
        if (hoursWorked>40) {
            overTimePay = overtimeHours * payRate * 1.5;
        }
        else {
            overTimePay = 0;
        }
        // Calculate weekly regular pay
        if (hoursWorked > 40) {
            weeklyPayWithoutOvertime = hrlyPayRate * 40;
        }







    }
}