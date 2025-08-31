//package oldJavaHomeworkAssignments;

import java.util.Scanner;
//javoc name.java
//java name

public class carEffiency {
    public static void main(String[] args) {
        int gallons;
        double fuelEffiency;
        double pricePerGallon;

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of gallons in the car tank: ");

        // same as >> cin from cpp
        gallons = in.nextInt();
        System.out.println(
                "Bet, your vehicle has " + gallons + " gallons. How much fuel is burned per gallon in that jawn?");
        fuelEffiency = in.nextDouble();
        System.out.println("Ok, so your vehicle burns " + fuelEffiency
                + " miles before one gallon is gone. Finally, how much is the price per gallon?");
        pricePerGallon = in.nextDouble();
        System.out.println("Ok, so it costs " + pricePerGallon
                + " per gallon for your vehicle.");
        // =======================================================

        double costPer100miles = (100 / fuelEffiency) * pricePerGallon;
        System.out.println("within 100 miles, you will end up spending");
        // decimal only showing two
        System.out.printf("%.2f", costPer100miles);
        // new line
        System.out.println();

        // conversion from double to int
        int distanceTot = gallons * (int) fuelEffiency;
        System.out.println("You can go a total distance of " + distanceTot + " miles before that jawn runs out of gas");

    }
}
