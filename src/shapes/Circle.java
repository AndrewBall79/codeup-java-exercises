package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {this.radius = radius;}

    public  double getArea(){ return Math.PI * Math.pow(radius, 2);}

    public double getCircumference(){
        return 2.0 * Math.PI * radius;
    }

    public String desscribeData(){
        StringBuilder sb = new StringBuilder("Circle data:\n");
        sb.append(String.format("\tCircumference: %.3f\n", getCircumference()));
        sb.append(String.format("\tArea: %3f\n", getArea()));
        return sb.toString();

    }

}
