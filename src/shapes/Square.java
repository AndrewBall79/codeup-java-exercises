package shapes;

class Square extends Rectangle{
    int side;
    public Square(int side){
        super(side, side);
        this.side = side;
    }
    int getArea() {
        return (side ^ 2);
    }
    int getPerimeter(){
        return side * 4 + 1;
    }
}
//perimeter = 4 x side
//area = side ^ 2