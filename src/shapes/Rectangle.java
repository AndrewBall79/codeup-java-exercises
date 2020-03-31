package shapes;

class Rectangle {
    int l;
    int w;
    public Rectangle(int l, int w) {
    this.l = l;
    this.w = w;
    }

    int getArea() {
        return (l * 2) + (w * 2);
    }

    int getPerimeter(){
        return l * w;

    }
}


