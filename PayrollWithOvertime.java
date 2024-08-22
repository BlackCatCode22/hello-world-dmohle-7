// dH 8/22/24
// PayrollWithOvertime.java

import java.util.Scanner;

public class PayrollWithOvertime {

    static void theHelloMethod(){
        System.out.println(" \n Hello from theHelloMethod() ! ");
    }

    // Create a method that gets input.
    // This is the method's definition.
    static void aPersonalGreeting(String someName) {
        System.out.println(" \n Hello " + someName + ", how are you today?");
    }

    // Create a method that gets twos integers and returns their sum.
    // Create two int parameters

    static int sumTwoInts(int num1, int num2) {
        int mySum = 0;
        mySum = num1 + num2;

        return mySum;
    }

    public static void main(String[] args) {

        System.out.printf("\nWelcome to Methods!\n");

        // Variables (members)
        String theUserName = "";

        // Create a Scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // Get the user's name.
        System.out.println("\n Please enter your name: ");
        theUserName = scanner.nextLine();

        // Call (invoke) our greeting method.
        aPersonalGreeting("...some literal string...");

        theHelloMethod();

        // variable.
        int aSum = 0;

        // Call our new sum method.
        aSum = sumTwoInts(3, 4);

        System.out.println(" \n aSum is: " + aSum);

        System.out.println("\n This is the end of my program");





        /*
        // Variables needed for Payroll program.
        double hrsWorked = 0.0;
        double otHrs = 0.0;
        double regHrs = 0.0;
        double regPay = 0.0;
        double otPay = 0.0;
        double totalPay = 0.0;
        double payRate = 0.0;

        // Create a Scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // Get hrs worked.
        System.out.println("\n Please enter weekly hours worked: ");
        hrsWorked = scanner.nextDouble();

        // Get pay rate.
        System.out.println("\n Please enter your pay rate: ");
        payRate = scanner.nextDouble();

        System.out.println("\n You worked " + hrsWorked + " hours this week.\n");

        // Check for overtime.
        if (hrsWorked > 40) {
            // There are overtime hours.
            System.out.println("\n You worked overtime this week.");
            otHrs = hrsWorked - 40;
            otPay = otHrs * payRate * 1.5;
            regPay = payRate * 40;
            regHrs = 40;
        }
        else {
            // There are NO overtime hours.
            System.out.println("\n No overtime was worked this week.");
            otHrs = 0;
            otPay = 0;
            regPay = hrsWorked * payRate;
            regHrs = hrsWorked;
        }

        // Output the number of overtime hours worked.
        System.out.printf("\n Overtime hours = ");
        System.out.printf("%, .2f",otHrs);

        // Output overtime pay.
        System.out.printf("\n Overtime pay = ");
        System.out.printf("%, .2f",otPay);

        // Line space for better-looking output.
        System.out.println("\n");

        // Output the number of regular hours worked.
        System.out.printf("\n Regular hours = ");
        System.out.printf("%, .2f",regHrs);

        // Line space for better-looking output.
        System.out.println("\n");

        // Output regular pay.
        System.out.printf("\n Regular pay = ");
        System.out.printf("%, .2f",regPay);
*/




    }
}