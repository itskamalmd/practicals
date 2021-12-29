class Rectangle{
    double length;
    double width;

    public Rectangle(double Length,double Width){
        this.length = Length;
        this.width = Width;
    }
    public double area(){
        return this.length * this.width;
    }
    public double perimeter() {
        return 2* (this.length + this.width);
    }
}

class ConstructingRectangle {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(20,40);
        Rectangle rectangle2 = new Rectangle(10,20);
        
        System.out.println("Area of rectangle1 is " + (rectangle1.area()));
        System.out.println("perimeter of the rectangle1 is " + (rectangle1.perimeter()));
    }
}
