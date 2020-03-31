package shapes;

import java.util.Arrays;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Box 1 Area: " + box1.getArea() +"\nBox 1 Perimeter: " + box1.getPerimeter());

        Rectangle box2 = new Square( 5);
        System.out.println("Box 2 Area: " + box2.getArea() +"\nBox 2 Perimeter: " + box2.getPerimeter());

    }
}
