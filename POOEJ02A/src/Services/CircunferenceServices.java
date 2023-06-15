package Services;

import Entity.Circunference;

public class CircunferenceServices {

    // Method createCircunference()
    public Circunference createCircunference(double radius) {
        Circunference circunference = new Circunference(radius);
        return circunference;
    }

    // Method area()
    public double area(Circunference circunference) {
        double radius = circunference.getRadius();
        double areaValue = Math.PI * Math.pow(radius, 2);
        return areaValue;
    }

    // Method perimeter()

    public double perimeter(Circunference circunference) {
        double radius = circunference.getRadius();
        double perimeter = 2 * Math.PI * radius;
        return perimeter;

    }

}
