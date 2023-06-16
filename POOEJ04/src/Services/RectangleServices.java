package Services;

import Entity.Rectangle;

public class RectangleServices {

    // Create object
    public Rectangle createRectangle(int base, int height) {
        Rectangle rectangle = new Rectangle(base, height);
        return rectangle;
    }

    // Method area
    public int surface(Rectangle rectangle) {
        int base = rectangle.getBase();
        int height = rectangle.getHeight();
        int surface = base * height;
        return surface;
    }

    // Method perimeter
    public int perimeter(Rectangle rectangle) {
        int base = rectangle.getBase();
        int height = rectangle.getHeight();
        int perimeter = (base + height) * 2;
        return perimeter;
    }

    // Method drawRectangle

    public String drawRectangle(Rectangle rectangle) {
        int base = rectangle.getBase();
        int height = rectangle.getHeight();
        String c = "*";
        /// NEW WAY, saving everything in a String var
        String ret = "";
        for (int m = 0; m < height; m++) {
            ret = ret + "\n";
            if (m == 0 || m == height - 1) {

                for (int l = 0; l < base; l++) {
                    ret = ret.concat(c);
                    ret = ret.concat(" ");
                }

            } else {

                for (int n = 0; n < (base * 2); n++) {

                    if (n == 0 || n == (base * 2) - 2) { // El último asterisco se ubica en la posición (base*2)-2 y la
                                                         // última posición (base*2) - 1 se rellena con espacio.
                        ret = ret + c;
                    } else {
                        ret = ret + " ";
                    }
                }
            }
        }

        return ret;
    }

}
