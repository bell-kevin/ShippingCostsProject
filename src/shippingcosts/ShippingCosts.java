/** ****************************************************************************
 * ShippingCosts.java
 * Kevin Bell
 * This program calculates shipping costs based on factors based on 3 weight
 * 3 distance categories, and employs unit testing procedures, with the tests
 * developed in advance of the program to practice Test Driven Development
 **************************************************************************** */
package shippingcosts;

import java.util.*; //Scanner

public class ShippingCosts {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        double weight, distance;
        System.out.println("Final Project: Shipping Costs by Kevin Bell\n");
        do {
            System.out.print("Enter a shipping weight: ");
            weight = Double.parseDouble(computerKeyboardInput.nextLine());
            System.out.print("Enter a shipping distance: ");
            distance = Double.parseDouble(computerKeyboardInput.nextLine());
        } while (weight <= 0 | distance <= 0);
        System.out.printf("%s%.2f%s%.2f%s%.2f\n", "The cost for shipping ", weight, " pounds ", distance, " miles is: $", getCost(getWeightFactor(weight),
                getDistanceFactor(distance)));
    } //end main

    public static double getWeightFactor(double weight) {
        if (weight < 10) {
            return 2.5;
        } else if (weight < 25) {
            return 10;
        } else {
            return 25;
        } //end if
    } //end getWeightFactor

    public static double getDistanceFactor(double distance) {
        if (distance < 100) {
            return 2;
        } else if (distance < 500) {
            return 5;
        } else {
            return 10;
        } //end if
    } //end getDistanceFactor

    public static double getCost(double weightFactor, double distanceFactor) {
        return weightFactor * distanceFactor;
    } //end getCost
} //end class ShippingCosts
