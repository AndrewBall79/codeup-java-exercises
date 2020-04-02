package shapes;

import java.util.SortedMap;

public class ShapesTest {
    public static void main(String[] args) {
//        Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.

        Measurable myShape;

        double length = 0;
        double width = 0;
        myShape = new Rectangle(length, width);
        System.out.println("\tBox1 Perimeter: " + myShape.getPerimeter(5));
        System.out.println("\tBox1 Area: " + myShape.getArea(7,2));

        Square box2 = new Square(length);
        System.out.println("\tBox2 Perimeter: " + box2.getPerimeter(5));
        System.out.println("\tBox2 Area: " + box2.getArea(7,2));



        System.out.println("\nPerimeter: \n\tmyShape: "+ myShape.getPerimeter(5) + "\nArea: \n\tmyShape: "+ myShape.getArea(5, 4));




    }
}

















//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("Box 1 Area: " + box1.getArea() + "\nBox 1 Perimeter: " + box1.getPerimeter());
//
//        Square box2 = new Square(5, 5);
//        System.out.println("Box 2 Area: " + box2.getArea() + "\nBox 2 Perimeter: " + box2.getPerimeter());
