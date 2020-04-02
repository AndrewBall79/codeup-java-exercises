package shapes;
//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter(double width) {
        System.out.println("Perimeter From Rectangle: ");
        return width * 4;
    }

    @Override
    public double getArea(double width, double length) {
        System.out.println("Area From Rectangle: ");
        return width * length;
    }


//    protected int l;
//    protected int w;
//    public Rectangle(int l, int w) {
//    this.l = l;
//    this.w = w;
//    }
//
//    int getArea() {
//        return (l * 2) + (w * 2);
//    }
//
//    int getPerimeter(){
//        return l * w;
//
//    }
}


