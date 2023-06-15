import java.util.Scanner;

import Entity.Circunference;
import Services.CircunferenceServices;

public class Menu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = read.nextDouble();
        read.close();
        CircunferenceServices cirServices = new CircunferenceServices();
        Circunference circunference = cirServices.createCircunference(radius);

        double area = cirServices.area(circunference);
        double perimeter = cirServices.perimeter(circunference);

        // Show the area and perimeter values
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
