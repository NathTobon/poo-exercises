import java.util.Scanner;

import Entity.CoffeeMaker;
import Services.CoffeeMakerServices;

public class Menu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the maximum capacity of the coffee maker");
        int maxCapacity = read.nextInt();

        CoffeeMakerServices cofServices = new CoffeeMakerServices();
        CoffeeMaker coffeeMaker = cofServices.createCoffeeMaker(maxCapacity, 0);

        boolean logOut = false;
        do {
            System.out.println("MENU");
            System.out.println("1. Fill the coffee maker.");
            System.out.println("2. Fill a cup.");
            System.out.println("3. Empty the coffee maker.");
            System.out.println("4. Add coffee. ");
            System.out.println("5. Log out.");
            System.out.println("What do you want to do next? Pick an option.");
            int choiceInput = read.nextInt();
            switch (choiceInput) {
                case 1:
                    // Fill the coffee maker
                    System.out.println("Filling the coffee maker...");
                    cofServices.fillCoffeeMaker(coffeeMaker);
                    System.out.println("...");
                    System.out.println("Coffee maker succesfully filled.");

                    break;
                case 2:
                    // Fill a cup
                    System.out.println("Enter the cup size");
                    int cupSize = read.nextInt();
                    System.out.println("Filling the cup...");
                    int cupFilled = cofServices.fillCup(coffeeMaker, cupSize);
                    System.out.println("...");

                    if (cupSize == cupFilled) {
                        System.out.println("Cup filled");
                    } else {
                        System.out.println("Cup filled until " + cupFilled);
                    }

                    break;
                case 3:
                    // Empty the coffee maker
                    System.out.println("Emptying the coffee maker...");
                    cofServices.emptyCoffeeMaker(coffeeMaker);
                    System.out.println("The coffee maker is empty.");
                    break;

                case 4:
                    // Add coffee
                    System.out.println("Enter the amount of coffee to be added");
                    int coffeeAmount = read.nextInt();
                    cofServices.addCoffee(coffeeMaker, coffeeAmount);
                    break;

                case 5:
                    // Log out
                    logOut = true;
                    break;
            }

        } while (logOut == false);

        read.close();

    }

}
