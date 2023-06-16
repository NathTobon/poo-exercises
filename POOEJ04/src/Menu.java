
import java.util.Scanner;
import Entity.Rectangle;
import Services.RectangleServices;

public class Menu {
    public static void main(String[] args) {
        // EXERCISE 04
        // Make a rectangle, read base and height data.
        // Show its area, its perimeter, and draw it.
        // First, reading the data from main.
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the rectangle's base");
        int base = read.nextInt();
        System.out.println("Enter the rectangle's height");
        int height = read.nextInt();
        read.close();
        // Declaring services
        RectangleServices recServices = new RectangleServices();
        // Instantiate Rectangle via service
        Rectangle rectangle = recServices.createRectangle(base, height);
        // Use the methods
        int surface = recServices.surface(rectangle);
        int perimeter = recServices.perimeter(rectangle);
        String drawing = recServices.drawRectangle(rectangle);

        System.out.println("Surface: " + surface);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Drawing: " + drawing);

    }
}
