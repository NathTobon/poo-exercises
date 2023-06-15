import java.util.Scanner;

import Entity.Operation;
import Services.OperationServices;

public class Menu {
    public static void main(String[] args) {
        // EXERCISE 03
        // First, reading the data from main.
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        read.close();
        // Declaring services
        OperationServices opServices = new OperationServices();
        // Instantiate operation via service
        Operation operation = opServices.createOperation(num1, num2);
        // Use the methods
        int addition = opServices.add(operation);
        int substraction = opServices.substract(operation);
        int multiplication = opServices.multiply(operation);
        double division = opServices.divide(operation);

        String errorMultiplication = "";
        String errorDivision = "";

        if (multiplication == 0) {
            errorMultiplication = ". ERROR: It cannot multiply by 0.";
        }
        if (division == 0) {
            errorDivision = ". ERROR: It cannot divide by 0.";
        }

        System.out.println("Addition: " + addition);
        System.out.println("Substraction: " + substraction);

        System.out.println("Multiplication: " + multiplication + errorMultiplication);
        System.out.println("Division: " + division + errorDivision);

    }
}
