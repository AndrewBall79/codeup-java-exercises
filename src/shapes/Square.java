package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter(double side) {
        System.out.println("Perimeter From Square: ");
        return width * 4;
    }

    @Override
    public double getArea(double width, double length) {
        System.out.println("Area From Square: ");
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }


//    protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    int getArea() {
//        return (side ^ 2);
//    }
//
//    @Override
//    int getPerimeter() {
//        System.out.println("Square Result: ");
//        return side * 4 + 1;
//    }
}

//perimeter = 4 x side
//area = side ^ 2